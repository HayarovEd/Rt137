package com.mez.hdu.narsports.mat.chs.mznm.ui.state

import com.mez.hdu.narsports.mat.chs.mznm.domain.model.GameRt137
import com.mez.hdu.narsports.mat.chs.mznm.domain.model.TaskQuiz
import com.mez.hdu.narsports.mat.chs.mznm.domain.model.tasks

data class MainStateRt137(
    val applicationRt137State: ApplicationRt137State = ApplicationRt137State.Loading,
    val correct: Int = 0,
    val incorrect: Int = 0,
    val currentNumberTask: Int = 0,
    val games: List<GameRt137> = emptyList(),
    val url: String = "",
    val tasksQuiz: List<TaskQuiz> = tasks,
    val error: String? = null
) {
    val percent = correct / tasksQuiz.size.toDouble()
}