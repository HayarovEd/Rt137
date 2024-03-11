package com.edurda77.domain.model

import com.edurda77.R

data class TaskQuiz (
    val id: Int,
    val quest: Int,
    val answer1: Int,
    val answer2: Int,
    val answer3: Int,
    val rightAnswer:Int
)


val tasks = listOf(
    TaskQuiz(
        id = 1,
        quest = R.string.quest_1,
        answer1 = R.string.answer_1_1,
        answer2 = R.string.answer_1_2,
        answer3 = R.string.answer_1_3,
        rightAnswer = R.string.answer_1_1
    ),
    TaskQuiz(
        id = 2,
        quest = R.string.quest_2,
        answer1 = R.string.answer_2_1,
        answer2 = R.string.answer_2_2,
        answer3 = R.string.answer_2_3,
        rightAnswer = R.string.answer_2_2
    ),
    TaskQuiz(
        id = 3,
        quest = R.string.quest_3,
        answer1 = R.string.answer_3_1,
        answer2 = R.string.answer_3_2,
        answer3 = R.string.answer_3_3,
        rightAnswer = R.string.answer_3_3
    ),
    TaskQuiz(
        id = 4,
        quest = R.string.quest_4,
        answer1 = R.string.answer_4_1,
        answer2 = R.string.answer_4_2,
        answer3 = R.string.answer_4_3,
        rightAnswer = R.string.answer_4_1
    ),
    TaskQuiz(
        id = 5,
        quest = R.string.quest_5,
        answer1 = R.string.answer_5_1,
        answer2 = R.string.answer_5_2,
        answer3 = R.string.answer_5_3,
        rightAnswer = R.string.answer_5_3
    ),
    TaskQuiz(
        id = 6,
        quest = R.string.quest_6,
        answer1 = R.string.answer_6_1,
        answer2 = R.string.answer_6_2,
        answer3 = R.string.answer_6_3,
        rightAnswer = R.string.answer_6_2
    ),

    TaskQuiz(
        id = 7,
        quest = R.string.quest_7,
        answer1 = R.string.answer_7_1,
        answer2 = R.string.answer_7_2,
        answer3 = R.string.answer_7_3,
        rightAnswer = R.string.answer_7_3
    ),
    TaskQuiz(
        id = 8,
        quest = R.string.quest_8,
        answer1 = R.string.answer_8_1,
        answer2 = R.string.answer_8_2,
        answer3 = R.string.answer_8_3,
        rightAnswer = R.string.answer_8_2
    ),
    TaskQuiz(
        id = 9,
        quest = R.string.quest_9,
        answer1 = R.string.answer_9_1,
        answer2 = R.string.answer_9_2,
        answer3 = R.string.answer_9_3,
        rightAnswer = R.string.answer_9_3
    ),
    TaskQuiz(
        id = 10,
        quest = R.string.quest_10,
        answer1 = R.string.answer_10_1,
        answer2 = R.string.answer_10_2,
        answer3 = R.string.answer_10_3,
        rightAnswer = R.string.answer_10_2
    ),
)