package com.edurda77.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Paging(
    @SerializedName("nextPage")
    val nextPage: String,
    @SerializedName("previousPage")
    val previousPage: String
)