package com.abc.def.g.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Paging(
    @SerializedName("nextPage")
    val nextPage: String,
    @SerializedName("previousPage")
    val previousPage: String
)