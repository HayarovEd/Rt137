package com.edurda77.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Rate(
    @SerializedName("american")
    val american: String,
    @SerializedName("decimal")
    val decimal: Double,
    @SerializedName("fractional")
    val fractional: String
)