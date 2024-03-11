package com.abc.def.g.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Competition(
    @SerializedName("color")
    val color: String,
    @SerializedName("competitorsType")
    val competitorsType: Int,
    @SerializedName("countryId")
    val countryId: Int,
    @SerializedName("currentPhaseName")
    val currentPhaseName: String,
    @SerializedName("currentPhaseNum")
    val currentPhaseNum: Int,
    @SerializedName("currentSeasonNum")
    val currentSeasonNum: Int,
    @SerializedName("currentStageNum")
    val currentStageNum: Int,
    @SerializedName("currentStageType")
    val currentStageType: Int,
    @SerializedName("hasActiveGames")
    val hasActiveGames: Boolean,
    @SerializedName("hasBrackets")
    val hasBrackets: Boolean,
    @SerializedName("hasLiveStandings")
    val hasLiveStandings: Boolean,
    @SerializedName("hasStandings")
    val hasStandings: Boolean,
    @SerializedName("hasStandingsGroups")
    val hasStandingsGroups: Boolean,
    @SerializedName("hideOnCatalog")
    val hideOnCatalog: Boolean,
    @SerializedName("hideOnSearch")
    val hideOnSearch: Boolean,
    @SerializedName("id")
    val id: Int,
    @SerializedName("imageVersion")
    val imageVersion: Int,
    @SerializedName("isInternational")
    val isInternational: Boolean,
    @SerializedName("liveGames")
    val liveGames: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("nameForURL")
    val nameForURL: String,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("sportId")
    val sportId: Int,
    @SerializedName("totalGames")
    val totalGames: Int
)