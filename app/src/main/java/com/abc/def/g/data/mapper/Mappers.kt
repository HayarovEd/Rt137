package com.abc.def.g.data.mapper

import com.abc.def.g.data.remote.dto.RemoteDto
import com.abc.def.g.domain.model.GameRt137


fun RemoteDto.mapToGames(): List<GameRt137> {
    return this.games.map { dto ->
        if (dto.odds != null) {
            GameRt137(
                awayScore = dto.awayCompetitor.score,
                awaySymbol = dto.awayCompetitor.symbolicName,
                awayTeam = dto.awayCompetitor.name,
                homeScore = dto.homeCompetitor.score,
                homeSymbol = dto.homeCompetitor.symbolicName,
                homeTeam = dto.homeCompetitor.name,
                awayRate = dto.odds.options[0].rate.decimal,
                homeRate = dto.odds.options[1].rate.decimal,
                timeStart = dto.startTime,
                homeColor = dto.homeCompetitor.color,
                awayColor = dto.awayCompetitor.color,
            )
        } else {
            GameRt137(
                awayScore = dto.awayCompetitor.score,
                awaySymbol = dto.awayCompetitor.symbolicName,
                awayTeam = dto.awayCompetitor.name,
                homeScore = dto.homeCompetitor.score,
                homeSymbol = dto.homeCompetitor.symbolicName,
                homeTeam = dto.homeCompetitor.name,
                awayRate = 1.2,
                homeRate = 1.9,
                timeStart = dto.startTime,
                homeColor = dto.homeCompetitor.color,
                awayColor = dto.awayCompetitor.color,
            )
        }
    }
}