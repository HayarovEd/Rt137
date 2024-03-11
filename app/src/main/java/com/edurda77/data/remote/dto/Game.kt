package com.edurda77.data.remote.dto


import com.google.gson.annotations.SerializedName

data class Game(
    @SerializedName("awayCompetitor")
    val awayCompetitor: AwayCompetitor,
    @SerializedName("competitionDisplayName")
    val competitionDisplayName: String,
    @SerializedName("competitionId")
    val competitionId: Int,
    @SerializedName("gameTime")
    val gameTime: Int,
    @SerializedName("gameTimeAndStatusDisplayType")
    val gameTimeAndStatusDisplayType: Int,
    @SerializedName("gameTimeDisplay")
    val gameTimeDisplay: String,
    @SerializedName("groupNum")
    val groupNum: Int,
    @SerializedName("h2hLayout")
    val h2hLayout: String,
    @SerializedName("hasBets")
    val hasBets: Boolean,
    @SerializedName("hasBrackets")
    val hasBrackets: Boolean,
    @SerializedName("hasFieldPositions")
    val hasFieldPositions: Boolean,
    @SerializedName("hasLineups")
    val hasLineups: Boolean,
    @SerializedName("hasMissingPlayers")
    val hasMissingPlayers: Boolean,
    @SerializedName("hasPreviousMeetings")
    val hasPreviousMeetings: Boolean,
    @SerializedName("hasRecentMatches")
    val hasRecentMatches: Boolean,
    @SerializedName("hasStandings")
    val hasStandings: Boolean,
    @SerializedName("hasStats")
    val hasStats: Boolean,
    @SerializedName("hasTVNetworks")
    val hasTVNetworks: Boolean,
    @SerializedName("homeAwayTeamOrder")
    val homeAwayTeamOrder: Int,
    @SerializedName("homeCompetitor")
    val homeCompetitor: HomeCompetitor,
    @SerializedName("id")
    val id: Int,
    @SerializedName("isHomeAwayInverted")
    val isHomeAwayInverted: Boolean,
    @SerializedName("justEnded")
    val justEnded: Boolean,
    @SerializedName("odds")
    val odds: Odds,
    @SerializedName("oddsPreview")
    val oddsPreview: OddsPreview,
    @SerializedName("seasonNum")
    val seasonNum: Int,
    @SerializedName("shortStatusText")
    val shortStatusText: String,
    @SerializedName("sportId")
    val sportId: Int,
    @SerializedName("stageNum")
    val stageNum: Int,
    @SerializedName("standingsName")
    val standingsName: String,
    @SerializedName("startTime")
    val startTime: String,
    @SerializedName("statusGroup")
    val statusGroup: Int,
    @SerializedName("statusText")
    val statusText: String,
    @SerializedName("winner")
    val winner: Int
)