package com.edurda77.data.remote.dto


import com.google.gson.annotations.SerializedName

data class LineType(
    @SerializedName("id")
    val id: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("title")
    val title: String
)