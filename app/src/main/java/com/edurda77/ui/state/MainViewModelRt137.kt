package com.edurda77.ui.state

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.edurda77.domain.model.tasks
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

@HiltViewModel
class MainViewModelRt137 : ViewModel() {
    private var _state = MutableStateFlow(MainStateRt137())
    val state = _state.asStateFlow()

    fun onEvent(event: MainEventRt137) {
        when (event) {
            is MainEventRt137.OnChangeStatusMock -> {
                _state.value.copy(
                    applicationRt137State = ApplicationRt137State.Mock(event.mockRt137)
                )
                    .updateStateUI()
            }

            is MainEventRt137.SetAnswer -> {
                calculate(
                    event.answer
                )
            }

            MainEventRt137.ResetQuiz -> {
                _state.value.copy(
                    incorrect = 0,
                    correct = 0,
                    currentNumberTask = 0,
                )
                    .updateStateUI()
            }
        }
    }

    private fun calculate(answer: Int) {
        viewModelScope.launch {
            if (tasks[_state.value.currentNumberTask].rightAnswer == answer) {
                _state.value.copy(
                    correct = _state.value.correct + 1,
                    currentNumberTask = _state.value.currentNumberTask + 1
                )
                    .updateStateUI()
            } else {
                _state.value.copy(
                    incorrect = _state.value.incorrect + 1,
                    currentNumberTask = _state.value.currentNumberTask + 1
                )
                    .updateStateUI()
            }
            if (_state.value.currentNumberTask+1 == tasks.size) {
                _state.value.copy(
                    applicationRt137State = ApplicationRt137State.Mock(MockRt137.ResultQuiz)
                )
                    .updateStateUI()
            }
        }
    }


    private fun MainStateRt137.updateStateUI() {
        _state.update {
            this
        }
    }
}