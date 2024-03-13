package com.mez.hdu.narsports.mat.chs.mznm.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mez.hdu.narsports.mat.chs.mznm.R
import com.mez.hdu.narsports.mat.chs.mznm.ui.state.MainEventRt137
import com.mez.hdu.narsports.mat.chs.mznm.ui.state.MockRt137
import com.mez.hdu.narsports.mat.chs.mznm.ui.theme.black
import com.mez.hdu.narsports.mat.chs.mznm.ui.theme.green
import com.mez.hdu.narsports.mat.chs.mznm.ui.theme.grey
import com.mez.hdu.narsports.mat.chs.mznm.ui.theme.orange
import com.mez.hdu.narsports.mat.chs.mznm.ui.theme.white

@Composable
fun StartScreen(
    modifier: Modifier = Modifier,
    sizeQuiz: Int,
    event: (MainEventRt137) -> Unit
) {
    BackHandler {
        event(MainEventRt137.OnChangeStatusMock(MockRt137.Selector))
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = black)
            .padding(horizontal = 10.dp, vertical = 20.dp)
    ) {
        IconButton(
            modifier = modifier
                .align(Alignment.TopStart),
            colors = IconButtonDefaults.iconButtonColors(
                containerColor = green
            ),
            onClick = {
                event(MainEventRt137.OnChangeStatusMock(MockRt137.Selector))
            }) {
            Icon(
                imageVector = ImageVector.vectorResource(id = R.drawable.baseline_arrow_back_24),
                contentDescription = "",
                tint = white
            )
        }
        Image(
            painter = painterResource(id = R.drawable.user_background),
            contentDescription = "",
            contentScale = ContentScale.FillWidth,
        )
        Card(
            modifier = modifier
                .align(Alignment.Center)
                .fillMaxWidth(),
            shape = RoundedCornerShape(32.dp),
            colors = CardDefaults.cardColors(
                containerColor = white
            )
        ) {
            Column(
                modifier = modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp, vertical = 30.dp)
            )
            {
                Text(
                    text = stringResource(id = R.string.sport),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = grey
                    )
                )
                Spacer(modifier = modifier.height(8.dp))
                Text(
                    text = stringResource(id = R.string.base_level),
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = black
                    )
                )
                Spacer(modifier = modifier.height(16.dp))
                Row (
                    modifier = modifier
                        .fillMaxWidth()
                        .background(color = grey)
                        .padding(vertical = 16.dp),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.quest),
                        contentDescription = "")
                    Spacer(modifier = modifier.width(12.dp))
                    Text(
                        text = "$sizeQuiz ${stringResource(id = R.string.questions)}",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(500),
                            color = black
                        )
                    )
                }
                Spacer(modifier = modifier.height(24.dp))
                Text(
                    text = stringResource(id = R.string.description),
                    style = TextStyle(
                        fontSize = 14.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = grey
                    )
                )
                Spacer(modifier = modifier.height(12.dp))
                Text(
                    text = stringResource(id = R.string.football_quiz),
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(400),
                        color = black
                    )
                )
                Spacer(modifier = modifier.height(16.dp))
                Button(
                    modifier = modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(
                        containerColor = orange
                    ),
                    contentPadding = PaddingValues(vertical = 16.dp),
                    onClick = {
                        event(MainEventRt137.OnChangeStatusMock(MockRt137.Quiz))
                        event(MainEventRt137.ResetQuiz)
                    })
                {
                    Text(
                        text = stringResource(id = R.string.begin),
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
    }
}
