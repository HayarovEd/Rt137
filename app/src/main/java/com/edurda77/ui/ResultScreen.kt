package com.edurda77.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edurda77.R
import com.edurda77.domain.model.tasks
import com.edurda77.ui.theme.black
import com.edurda77.ui.theme.grey
import com.edurda77.ui.theme.orange
import com.edurda77.ui.theme.white

@Composable
fun ResultScreen(
    modifier: Modifier = Modifier,
    countCorrect: Int,
    countIncorrect: Int,
    percent: Double
) {
    Column (
        modifier = modifier
            .fillMaxSize()
            .background(color = white)
            .padding(24.dp)
    ){
        Text(
            modifier = modifier.fillMaxWidth(),
            text = stringResource(id = R.string.good_job),
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(500),
                color = black,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = modifier.height(16.dp))
        Image(
            modifier = modifier.fillMaxWidth(),
            painter = painterResource(id = R.drawable.image_result),
            contentDescription = "",
            contentScale = ContentScale.FillWidth)
        Spacer(modifier = modifier.height(47.dp))
        Text(
            text = stringResource(id = R.string.right_answers),
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(500),
                color = black,
            )
        )
        Spacer(modifier = modifier.height(33.dp))
        Row (
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Column (
                modifier = modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(id = R.string.correct),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = grey,
                    )
                )
                Spacer(modifier = modifier.height(8.dp))
                Text(
                    text = countCorrect.toString(),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = black,
                    )
                )
            }
            Column (
                modifier = modifier.weight(1f)
            ) {
                Text(
                    text = stringResource(id = R.string.incorrect),
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = grey,
                    )
                )
                Spacer(modifier = modifier.height(8.dp))
                Text(
                    text = countIncorrect.toString(),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = black,
                    )
                )
            }
        }
        Spacer(modifier = modifier.height(43.dp))
        Text(
            text = stringResource(id = R.string.result),
            style = TextStyle(
                fontSize = 12.sp,
                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(500),
                color = grey,
            )
        )
        Spacer(modifier = modifier.height(8.dp))
        Text(
            text = percent.toString(),
            style = TextStyle(
                fontSize = 20.sp,
                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(500),
                color = black,
            )
        )
        Spacer(modifier = modifier.height(60.dp))
        Button(
            modifier = modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = white
            ),
            border = BorderStroke(width = 1.dp, color = orange),
            contentPadding = PaddingValues(vertical = 16.dp),
            onClick = {

            })
        {
            Text(
                text = stringResource(id = R.string.again),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = orange
                )
            )
        }
        Spacer(modifier = modifier.height(11.dp))
        Button(
            modifier = modifier
                .fillMaxWidth(),
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = orange
            ),
            contentPadding = PaddingValues(vertical = 16.dp),
            onClick = {

            })
        {
            Text(
                text = stringResource(id = R.string.complete_quiz),
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(500),
                    color = white
                )
            )
        }
    }
}

@Preview
@Composable
private fun ViewQuizScreen() {
    ResultScreen(
        countCorrect = 7,
        countIncorrect = 3,
        percent = 70.0)
}