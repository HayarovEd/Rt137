package com.edurda77.data.remote.dto


import com.google.gson.annotations.SerializedName

data class ActionButton(
    @SerializedName("label")
    val label: String,
    @SerializedName("link")
    val link: String
)