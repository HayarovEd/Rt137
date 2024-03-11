package com.edurda77.data.repository

import android.app.Application
import android.content.Context
import com.backendless.Backendless
import com.edurda77.data.mapper.mapToGames
import com.edurda77.data.remote.RapidApiRt137
import com.edurda77.domain.model.GameRt137
import com.edurda77.domain.repository.RemoteRepositoryRt137
import com.edurda77.domain.utils.ANDROID_API_KEY
import com.edurda77.domain.utils.APPLICATION_ID
import com.edurda77.domain.utils.BACK_URL
import com.edurda77.domain.utils.NAME
import com.edurda77.domain.utils.ResourceRt137
import com.edurda77.domain.utils.TABLE_NAME
import com.edurda77.domain.utils.OBJECT_ID_KEY
import com.edurda77.domain.utils.POLITIC_URL
import com.edurda77.domain.utils.SHARED_DATA
import com.edurda77.domain.utils.SHARED_URL
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.OkHttpClient
import okhttp3.Request
import javax.inject.Inject

class RemoteRepositoryRt137Impl @Inject constructor(
    private val rapidApiRt137: RapidApiRt137,
    private val application: Application
) : RemoteRepositoryRt137 {

    private val sharedPrefRt137 =
        application.getSharedPreferences(SHARED_DATA, Context.MODE_PRIVATE)

    override suspend fun getData(): ResourceRt137<List<GameRt137>> {
        return try {
            val result = rapidApiRt137.getDataDb()
            ResourceRt137.Success(
                data = result.mapToGames()
            )
        } catch (e: Exception) {
            e.printStackTrace()
            ResourceRt137.Error(e.message ?: "An unknown error")
        }
    }

    override suspend fun getUrl(): ResourceRt137<String> {
        return try {
            withContext(Dispatchers.IO)
            {
                Backendless.setUrl(BACK_URL)
                Backendless.initApp(application, APPLICATION_ID, ANDROID_API_KEY)
                val result = Backendless.Data.of(TABLE_NAME).findById(OBJECT_ID_KEY)[NAME]
                if (result != null) {
                    if (result != POLITIC_URL) {
                        try {
                            val client = OkHttpClient()
                            val request = Request.Builder()
                                .url(result.toString())
                                .get()
                                .addHeader("User-Agent", "Mozilla/5.0")
                                .build()
                            val response = client.newCall(request).execute()
                            if (response.isSuccessful) {
                                ResourceRt137.Success(response.request().url().toString())
                            } else {
                                ResourceRt137.Error("bad")
                            }
                        } catch (e: Exception) {
                            e.printStackTrace()
                            ResourceRt137.Error(e.message ?: "An unknown error")
                        }
                    } else {
                        ResourceRt137.Error("politic url")
                    }
                } else {
                    ResourceRt137.Error("empty data")
                }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            ResourceRt137.Error(e.message ?: "An unknown error")
        }
    }

    override suspend fun getSharedUrl(): String? = sharedPrefRt137.getString(SHARED_URL, "")

    override suspend fun setSharedUrl(date: String) =
        sharedPrefRt137.edit().putString(SHARED_URL, date).apply()
}