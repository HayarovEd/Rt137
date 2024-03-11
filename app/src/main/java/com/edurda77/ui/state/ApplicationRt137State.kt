package com.edurda77.ui.state

sealed class ApplicationRt137State {
    data object Loading : ApplicationRt137State()
    class Success(val url:String) : ApplicationRt137State()
    class Mock (val mockRt137: MockRt137) : ApplicationRt137State()
}


sealed interface MockRt137{
    data object Selector:MockRt137
    data object Quiz:MockRt137
    data object ResultQuiz:MockRt137
    data object Tournament:MockRt137
}