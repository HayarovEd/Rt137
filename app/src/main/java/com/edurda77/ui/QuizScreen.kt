package com.edurda77.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edurda77.R
import com.edurda77.domain.model.TaskQuiz
import com.edurda77.domain.model.tasks
import com.edurda77.ui.theme.black
import com.edurda77.ui.theme.grey
import com.edurda77.ui.theme.orange
import com.edurda77.ui.theme.white

@Composable
fun QuizScreen(
    modifier: Modifier = Modifier,
    taskQuiz: TaskQuiz,
    sizeQuiz: Int
) {
    val selectedAnswer = remember { mutableStateOf("") }
    val context = LocalContext.current
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = black)
            .padding(horizontal = 10.dp, vertical = 20.dp)
    ) {
        Card(
            modifier = modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(32.dp),
            colors = CardDefaults.cardColors(
                containerColor = white
            )
        ) {
            Column (
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 30.dp)
            )
            {
                Text(
                    text = "${stringResource(id = R.string.question)} ${taskQuiz.id} ${stringResource(id = R.string.from)} $sizeQuiz",
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = grey
                    )
                )
                Spacer(modifier = modifier.height(8.dp))
                Text(
                    text = stringResource(id = taskQuiz.quest),
                    style = TextStyle(
                        fontSize = 18.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = black
                    )
                )
                Spacer(modifier = modifier.height(30.dp))
                Button(
                    modifier = modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedAnswer.value == stringResource(id = taskQuiz.answer1)) grey else white
                    ),
                    border = BorderStroke(
                        width = if (selectedAnswer.value == stringResource(id = taskQuiz.answer1)) 0.dp else 1.dp,
                        color = grey
                    ),
                    contentPadding = PaddingValues(vertical = 16.dp),
                    onClick = {
                        selectedAnswer.value = context.getString(taskQuiz.answer1)
                    })
                {
                    Text(
                        text = stringResource(id = taskQuiz.answer1),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = if (selectedAnswer.value == stringResource(id = taskQuiz.answer1)) FontWeight(
                                500
                            ) else FontWeight(400),
                            color = black
                        )
                    )
                }
                Spacer(modifier = modifier.height(16.dp))
                Button(
                    modifier = modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedAnswer.value == stringResource(id = taskQuiz.answer2)) grey else white
                    ),
                    border = BorderStroke(
                        width = if (selectedAnswer.value == stringResource(id = taskQuiz.answer2)) 0.dp else 1.dp,
                        color = grey
                    ),
                    contentPadding = PaddingValues(vertical = 16.dp),
                    onClick = {
                        selectedAnswer.value = context.getString(taskQuiz.answer2)
                    })
                {
                    Text(
                        text = stringResource(id = taskQuiz.answer2),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = if (selectedAnswer.value == stringResource(id = taskQuiz.answer2)) FontWeight(
                                500
                            ) else FontWeight(400),
                            color = black
                        )
                    )
                }
                Spacer(modifier = modifier.height(16.dp))
                Button(
                    modifier = modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (selectedAnswer.value == stringResource(id = taskQuiz.answer3)) grey else white
                    ),
                    border = BorderStroke(
                        width = if (selectedAnswer.value == stringResource(id = taskQuiz.answer3)) 0.dp else 1.dp,
                        color = grey
                    ),
                    contentPadding = PaddingValues(vertical = 16.dp),
                    onClick = {
                        selectedAnswer.value = context.getString(taskQuiz.answer3)
                    })
                {
                    Text(
                        text = stringResource(id = taskQuiz.answer3),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = if (selectedAnswer.value == stringResource(id = taskQuiz.answer3)) FontWeight(
                                500
                            ) else FontWeight(400),
                            color = black
                        )
                    )
                }
                Spacer(modifier = modifier.height(80.dp))
                Button(
                    modifier = modifier
                        .fillMaxWidth(),
                    enabled = selectedAnswer.value.isNotBlank(),
                    shape = RoundedCornerShape(24.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = orange
                    ),
                    contentPadding = PaddingValues(vertical = 14.dp),
                    onClick = {

                    })
                {
                    Text(
                        text = stringResource(id = R.string.next),
                        style = TextStyle(
                            fontSize = 30.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(600),
                            color = white
                        )
                    )
                }
            }
        }
    }
}
@Preview
@Composable
private fun ViewQuizScreen() {
    QuizScreen(
        taskQuiz = tasks[0],
        sizeQuiz = 10)
}