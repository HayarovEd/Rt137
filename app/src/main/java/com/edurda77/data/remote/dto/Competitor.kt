package com.edurda77.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Competitor(
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
    @SerializedName("mainCompetitionId")
    val mainCompetitionId: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nameForURL")
    val nameForURL: String,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("shortName")
    val shortName: String,
    @SerializedName("sportId")
    val sportId: Int,
    @SerializedName("symbolicName")
    val symbolicName: String,
    @SerializedName("type")
    val type: Int
)