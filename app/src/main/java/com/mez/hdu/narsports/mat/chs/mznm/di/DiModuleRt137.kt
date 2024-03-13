package com.mez.hdu.narsports.mat.chs.mznm.di

import com.mez.hdu.narsports.mat.chs.mznm.data.repository.RemoteRepositoryRt137Impl
import com.mez.hdu.narsports.mat.chs.mznm.domain.repository.RemoteRepositoryRt137
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class DiModuleRt137 {

    @Binds
    @Singleton
    abstract fun bindRepository(repositoryRt137: RemoteRepositoryRt137Impl): RemoteRepositoryRt137


}