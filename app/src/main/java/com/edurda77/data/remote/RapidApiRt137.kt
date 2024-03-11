package com.edurda77.data.remote

import com.edurda77.data.remote.dto.RemoteDto
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface RapidApiRt137 {
    @GET("results")
    suspend fun getDataDb (
        @Header ("X-RapidAPI-Key") rapidToken: String = "82c226bb20msh7b3b89717699044p12f989jsn0fcfffdeed15",
        @Header ("X-RapidAPI-Host") rapidHost: String = "allscores.p.rapidapi.com",
        @Query ("langId") langId: Int = 1,
        @Query ("timezone") timezone: String = "America%2FChicago",
        @Query ("competition") competition: Int = 103,
        ) : RemoteDto
}