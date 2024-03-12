package com.abc.def.g.domain.model

data class GameRt137(
    val homeTeam: String,
    val awayTeam: String,
    val homeScore: Int,
    val awayScore: Int,
    val homeSymbol: String,
    val awaySymbol: String,
    val awayRate: Double,
    val homeRate: Double,
    val timeStart: String,
    val homeColor: String,
    val awayColor: String,
) {
    val isHomeWin = homeScore > awayScore
}
