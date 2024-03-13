package com.mez.hdu.narsports.mat.chs.mznm.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Sport(
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageVersion")
    val imageVersion: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nameForURL")
    val nameForURL: String
)