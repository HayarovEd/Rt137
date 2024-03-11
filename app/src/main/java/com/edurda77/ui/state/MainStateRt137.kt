package com.edurda77.ui.state

import com.edurda77.domain.model.GameRt137
import com.edurda77.domain.model.tasks

data class MainStateRt137(
    val applicationRt137State: ApplicationRt137State = ApplicationRt137State.Loading,
    val correct: Int = 0,
    val incorrect: Int = 0,
    val currentNumberTask: Int = 0,
    val games: List<GameRt137> = emptyList(),
    val url: String = ""
) {
    val percent = correct / tasks.size.toDouble()
}