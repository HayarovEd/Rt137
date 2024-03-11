package com.edurda77.data.repository

import android.util.Log
import com.edurda77.data.mapper.mapToGames
import com.edurda77.data.remote.RapidApiRt137
import com.edurda77.domain.model.GameRt137
import com.edurda77.domain.repository.RemoteRepositoryRt137
import com.edurda77.domain.utils.ResourceRt137

class RemoteRepositoryRt137Impl(
    private val rapidApiRt137: RapidApiRt137
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
}