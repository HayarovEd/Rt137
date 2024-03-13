package com.mez.hdu.narsports.mat.chs.mznm.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Country(
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageVersion")
    val imageVersion: Int,
    @SerializedName("liveGames")
    val liveGames: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nameForURL")
    val nameForURL: String,
    @SerializedName("sportTypes")
    val sportTypes: List<Int>,
    @SerializedName("totalGames")
    val totalGames: Int
)