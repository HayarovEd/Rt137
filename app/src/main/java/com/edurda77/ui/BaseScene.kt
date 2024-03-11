package com.edurda77.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.hilt.navigation.compose.hiltViewModel
import com.edurda77.domain.model.tasks
import com.edurda77.ui.state.ApplicationRt137State
import com.edurda77.ui.state.MainViewModelRt137
import com.edurda77.ui.state.MockRt137

@Composable
fun BaseScene(
    viewModel: MainViewModelRt137 = hiltViewModel()
) {
    val state = viewModel.state.collectAsState()
    val event = viewModel::onEvent

    when (val applicationStateRt137 = state.value.applicationRt137State) {
        ApplicationRt137State.Loading -> {
            LoadingScreen()
        }

        is ApplicationRt137State.Mock -> {
            when (applicationStateRt137.mockRt137) {
                MockRt137.Quiz -> {
                    QuizScreen(
                        taskQuiz = tasks[state.value.currentNumberTask],
                        sizeQuiz = tasks.size,
                        event = event,
                    )
                }

                MockRt137.ResultQuiz -> {
                    ResultScreen(
                        countCorrect = state.value.correct,
                        countIncorrect = state.value.incorrect,
                        percent = state.value.percent,
                        event = event,
                    )
                }

                MockRt137.Selector -> {
                    SelectorScreen(
                        event = event,
                    )
                }

                MockRt137.Tournament -> {
                    TournamentScreen(
                        games = state.value.games,
                        event = event,
                    )
                }
            }
        }

        is ApplicationRt137State.Success -> {
            WebViewScreen(urlRt137 = applicationStateRt137.url)
        }
    }
}