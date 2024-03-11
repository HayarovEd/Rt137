package com.edurda77.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Cell(
    @SerializedName("isBold")
    val isBold: Boolean,
    @SerializedName("text")
    val text: String
)