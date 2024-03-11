package com.abc.def.g.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Cell(
    @SerializedName("isBold")
    val isBold: Boolean,
    @SerializedName("text")
    val text: String
)