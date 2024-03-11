package com.abc.def.g.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Bookmaker(
    @SerializedName("actionButton")
    val actionButton: ActionButton,
    @SerializedName("color")
    val color: String,
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageVersion")
    val imageVersion: Int,
    @SerializedName("link")
    val link: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("nameForURL")
    val nameForURL: String
)