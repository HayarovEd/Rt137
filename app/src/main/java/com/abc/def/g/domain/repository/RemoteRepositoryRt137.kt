package com.abc.def.g.domain.repository

import com.abc.def.g.domain.model.GameRt137
import com.abc.def.g.domain.utils.ResourceRt137

interface RemoteRepositoryRt137 {
    suspend fun getData(): ResourceRt137<List<GameRt137>>
    suspend fun getUrl(): ResourceRt137<String>
    suspend fun getSharedUrl(): String?
    suspend fun setSharedUrl(date: String)
}