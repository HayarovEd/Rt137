package com.abc.def.g.data.remote.dto


import com.google.gson.annotations.SerializedName

data class HomeCompetitor(
    @SerializedName("color")
    val color: String,
    @SerializedName("competitorNum")
    val competitorNum: Int,
    @SerializedName("countryId")
    val countryId: Int,
    @SerializedName("hasSquad")
    val hasSquad: Boolean,
    @SerializedName("hasTransfers")
    val hasTransfers: Boolean,
    @SerializedName("hideOnCatalog")
    val hideOnCatalog: Boolean,
    @SerializedName("hideOnSearch")
    val hideOnSearch: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageVersion")
    val imageVersion: Int,
    @SerializedName("isQualified")
    val isQualified: Boolean,
    @SerializedName("isWinner")
    val isWinner: Boolean,
    @SerializedName("mainCompetitionId")
    val mainCompetitionId: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nameForURL")
    val nameForURL: String,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("score")
    val score: Int,
    @SerializedName("shortName")
    val shortName: String,
    @SerializedName("sportId")
    val sportId: Int,
    @SerializedName("symbolicName")
    val symbolicName: String,
    @SerializedName("toQualify")
    val toQualify: Boolean,
    @SerializedName("type")
    val type: Int
)