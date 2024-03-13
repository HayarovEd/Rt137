package com.mez.hdu.narsports.mat.chs.mznm.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Odds(
    @SerializedName("bookmaker")
    val bookmaker: Bookmaker,
    @SerializedName("bookmakerId")
    val bookmakerId: Int,
    @SerializedName("gameId")
    val gameId: Int,
    @SerializedName("isConcluded")
    val isConcluded: Boolean,
    @SerializedName("lineId")
    val lineId: Int,
    @SerializedName("lineType")
    val lineType: LineType,
    @SerializedName("lineTypeId")
    val lineTypeId: Int,
    @SerializedName("link")
    val link: String,
    @SerializedName("options")
    val options: List<Option>,
    @SerializedName("outcomeOptionNum")
    val outcomeOptionNum: Int,
    @SerializedName("trackingUrl")
    val trackingUrl: String
)