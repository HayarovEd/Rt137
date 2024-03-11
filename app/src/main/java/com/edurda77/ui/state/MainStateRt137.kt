package com.edurda77.ui.state

import com.edurda77.domain.model.tasks

data class MainStateRt137 (
    val applicationRt137State: ApplicationRt137State = ApplicationRt137State.Mock(MockRt137.Selector),
    val correct: Int = 0,
    val incorrect: Int = 0,
    val currentNumberTask: Int = 0,
) {
    val percent = correct/tasks.size.toDouble()
}