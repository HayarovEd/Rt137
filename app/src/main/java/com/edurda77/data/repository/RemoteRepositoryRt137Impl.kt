package com.edurda77.data.repository

import android.app.Application
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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RemoteRepositoryRt137Impl @Inject constructor(
    private val rapidApiRt137: RapidApiRt137,
    private val application: Application
) : RemoteRepositoryRt137 {
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

    override suspend fun getUrl(): ResourceRt137<String?> {
        return try {
            withContext(Dispatchers.IO)
            {
                Backendless.setUrl(BACK_URL)
                Backendless.initApp(application, APPLICATION_ID, ANDROID_API_KEY)
                val result = Backendless.Data.of(TABLE_NAME).findById(OBJECT_ID_KEY)[NAME]
                if (result!= null) {
                ResourceRt137.Success(result.toString())
                    } else {
                        ResourceRt137.Success(null)
                    }
            }
        } catch (e: Exception) {
            e.printStackTrace()
            ResourceRt137.Error(e.message ?: "An unknown error")
        }
    }
}