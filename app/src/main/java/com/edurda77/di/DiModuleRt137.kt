package com.edurda77.di

import com.edurda77.data.repository.RemoteRepositoryRt137Impl
import com.edurda77.domain.repository.RemoteRepositoryRt137
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