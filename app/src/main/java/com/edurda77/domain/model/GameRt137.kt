package com.edurda77.domain.model

data class GameRt137(
    val homeTeam: String,
    val awayTeam: String,
    val homeScore: Int,
    val awayScore: Int,
    val homeSymbol: String,
    val awaySymbol: String,
) {
    val isHomeWin = homeScore > awayScore
}
