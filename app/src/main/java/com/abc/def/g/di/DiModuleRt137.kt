package com.abc.def.g.di

import com.abc.def.g.data.repository.RemoteRepositoryRt137Impl
import com.abc.def.g.domain.repository.RemoteRepositoryRt137
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