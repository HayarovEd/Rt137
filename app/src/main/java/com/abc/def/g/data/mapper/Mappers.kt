package com.abc.def.g.data.mapper

import com.abc.def.g.data.remote.dto.RemoteDto
import com.abc.def.g.domain.model.GameRt137


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