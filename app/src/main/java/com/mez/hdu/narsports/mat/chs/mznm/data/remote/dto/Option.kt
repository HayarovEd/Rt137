package com.mez.hdu.narsports.mat.chs.mznm.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Option(
    @SerializedName("bookmakerId")
    val bookmakerId: Int,
    @SerializedName("isWon")
    val isWon: Boolean,
    @SerializedName("link")
    val link: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("num")
    val num: Int,
    @SerializedName("rate")
    val rate: Rate,
    @SerializedName("trend")
    val trend: Int
)