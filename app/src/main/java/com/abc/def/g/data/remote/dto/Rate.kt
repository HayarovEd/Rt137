package com.abc.def.g.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Rate(
    @SerializedName("american")
    val american: String,
    @SerializedName("decimal")
    val decimal: Double,
    @SerializedName("fractional")
    val fractional: String
)