package com.abc.def.g.ui.state

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.abc.def.g.domain.model.tasks
import com.abc.def.g.domain.repository.RemoteRepositoryRt137
import com.abc.def.g.domain.utils.ResourceRt137
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModelRt137 @Inject constructor(
    private val remoteRepositoryRt137: RemoteRepositoryRt137,
) : ViewModel() {
    private var _state = MutableStateFlow(MainStateRt137())
    val state = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val savedUrl = remoteRepositoryRt137.getSharedUrl()
            getData()
            if (savedUrl.isNullOrBlank()) {
                getUrl()
            } else {
                _state.value.copy(
                    applicationRt137State = ApplicationRt137State.Mock(MockRt137.Selector),
                    url = savedUrl
                )
                    .updateStateUI()
            }
        }
    }


    private suspend fun getData() {
        when (val result = remoteRepositoryRt137.getData()) {
            is ResourceRt137.Error -> {
                Log.d("MainViewModelRt137", "error -${result.message}")
                _state.value.copy(
                    error = result.message?:"",
                )
                    .updateStateUI()
            }

            is ResourceRt137.Success -> {
                Log.d("MainViewModelRt137", "result -${result.data}")
                _state.value.copy(
                    games = result.data ?: emptyList(),
                    tasksQuiz = tasks.shuffled()
                )
                    .updateStateUI()
            }
        }
    }

    private suspend fun getUrl() {
        when (val result = remoteRepositoryRt137.getUrl()) {
            is ResourceRt137.Error -> {
                _state.value.copy(
                    applicationRt137State = ApplicationRt137State.Mock(MockRt137.Selector)
                )
                    .updateStateUI()
            }

            is ResourceRt137.Success -> {
                if (result.data != null) {
                    _state.value.copy(
                        ApplicationRt137State.Mock(MockRt137.Selector),
                        url = result.data
                    )
                        .updateStateUI()
                    remoteRepositoryRt137.setSharedUrl(result.data)
                } else {
                    _state.value.copy(
                        applicationRt137State = ApplicationRt137State.Mock(MockRt137.Selector)
                    )
                        .updateStateUI()
                }
            }
        }
    }

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
            if (_state.value.tasksQuiz[_state.value.currentNumberTask].rightAnswer == answer) {
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
            if (_state.value.currentNumberTask == tasks.size) {
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