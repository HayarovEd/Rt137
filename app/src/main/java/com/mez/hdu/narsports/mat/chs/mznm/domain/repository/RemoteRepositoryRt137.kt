package com.mez.hdu.narsports.mat.chs.mznm.domain.repository

import com.mez.hdu.narsports.mat.chs.mznm.domain.model.GameRt137
import com.mez.hdu.narsports.mat.chs.mznm.domain.utils.ResourceRt137

interface RemoteRepositoryRt137 {
    suspend fun getData(): ResourceRt137<List<GameRt137>>
    suspend fun getUrl(): ResourceRt137<String>
    suspend fun getSharedUrl(): String?
    suspend fun setSharedUrl(date: String)
}