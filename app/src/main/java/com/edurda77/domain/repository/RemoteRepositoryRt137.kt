package com.edurda77.domain.repository

import com.edurda77.domain.model.GameRt137
import com.edurda77.domain.utils.ResourceRt137

interface RemoteRepositoryRt137 {
    suspend fun getData(): ResourceRt137<List<GameRt137>>
    suspend fun getUrl(): ResourceRt137<String?>
}