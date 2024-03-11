package com.edurda77.ui.state

sealed class MainEventRt137 {
    class OnChangeStatusMock (val mockRt137: MockRt137):MainEventRt137()
    class SetAnswer(val answer: Int):MainEventRt137()
    data object ResetQuiz : MainEventRt137()
}