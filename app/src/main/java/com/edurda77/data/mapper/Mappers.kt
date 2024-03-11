package com.edurda77.data.mapper

import com.edurda77.data.remote.dto.RemoteDto
import com.edurda77.domain.model.GameRt137


fun RemoteDto.mapToGames(): List<GameRt137> {
    return this.games.map { dto ->
        GameRt137(
            awayScore = dto.awayCompetitor.score,
            awaySymbol = dto.awayCompetitor.symbolicName,
            awayTeam = dto.awayCompetitor.name,
            homeScore = dto.homeCompetitor.score,
            homeSymbol = dto.homeCompetitor.symbolicName,
            homeTeam = dto.homeCompetitor.name,
        )
    }
}