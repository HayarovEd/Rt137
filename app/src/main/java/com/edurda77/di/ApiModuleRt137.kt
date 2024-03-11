package com.edurda77.di

import com.edurda77.data.remote.RapidApiRt137
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val URL_ANALYTICS = "https://allscores.p.rapidapi.com/api/allscores/"
@Module
@InstallIn(SingletonComponent::class)
object ApiModuleRt137 {
    @Provides
    @Singleton
    fun provideApi(): RapidApiRt137 {
        return Retrofit.Builder()
            .baseUrl(URL_ANALYTICS)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RapidApiRt137::class.java)
    }

}