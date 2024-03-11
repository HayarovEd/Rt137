package com.edurda77.ui

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.edurda77.R
import com.edurda77.ui.state.MainEventRt137
import com.edurda77.ui.state.MockRt137
import com.edurda77.ui.theme.orange
import com.edurda77.ui.theme.white

@Composable
fun SelectorScreen(
    modifier: Modifier = Modifier,
    event: (MainEventRt137) -> Unit,
    url: String
) {
    val context = LocalContext.current

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            modifier = modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background_game),
            contentDescription = "",
            contentScale = ContentScale.FillBounds
        )
        Column(
            modifier = modifier
                .align(alignment = Alignment.Center)
                .padding(horizontal = 13.dp)
                .fillMaxWidth()
        ) {
            if (url.isNotBlank()) {
                Card(
                    modifier = modifier
                        .fillMaxWidth(),
                    shape = RoundedCornerShape(24.dp),
                    border = BorderStroke(width = 3.dp, color = orange),
                    colors = CardDefaults.cardColors(
                        containerColor = white
                    )
                ) {
                    Column(
                        modifier = modifier
                            .fillMaxWidth()
                            .padding(start = 15.dp, end = 15.dp, top = 36.dp, bottom = 16.dp)
                    ) {

                        Button(
                            modifier = modifier
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(24.dp),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = orange
                            ),
                            contentPadding = PaddingValues(vertical = 12.dp),
                            onClick = {
                                val uri = Uri.parse(url)
                                val intent = Intent(Intent.ACTION_VIEW, uri)
                                context.startActivity(intent)
                            })
                        {
                            Text(
                                text = stringResource(id = R.string.put),
                                style = TextStyle(
                                    fontSize = 30.sp,
                                    fontFamily = FontFamily(Font(R.font.inter)),
                                    fontWeight = FontWeight(600),
                                    color = white
                                )
                            )
                        }

                        Spacer(modifier = modifier.height(28.dp))
                        Text(
                            modifier = modifier
                                .fillMaxWidth(),
                            text = stringResource(id = R.string.eighteen_plus),
                            style = TextStyle(
                                fontSize = 30.sp,
                                fontFamily = FontFamily(Font(R.font.inter)),
                                fontWeight = FontWeight(600),
                                color = orange,
                                textAlign = TextAlign.Center
                            )
                        )
                    }
                }
                Spacer(modifier = modifier.height(37.dp))
                Text(
                    modifier = modifier
                        .fillMaxWidth(),
                    text = stringResource(id = R.string.warning_put),
                    style = TextStyle(
                        fontSize = 19.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(800),
                        color = white,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
        Column(
            modifier = modifier
                .align(alignment = if (url.isNotBlank()) Alignment.BottomCenter else Alignment.Center)
                .padding(start = 64.dp, end = 64.dp, bottom = 40.dp)
                .fillMaxWidth()
        ) {
            Button(
                modifier = modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = white
                ),
                border = BorderStroke(width = 1.dp, color = orange),
                contentPadding = PaddingValues(vertical = 19.dp),
                onClick = {
                    event(MainEventRt137.OnChangeStatusMock(MockRt137.Tournament))
                })
            {
                Text(
                    text = stringResource(id = R.string.tournaments),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = orange
                    )
                )
            }
            Spacer(modifier = modifier.height(20.dp))
            Button(
                modifier = modifier
                    .fillMaxWidth(),
                shape = RoundedCornerShape(24.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = white
                ),
                border = BorderStroke(width = 1.dp, color = orange),
                contentPadding = PaddingValues(vertical = 19.dp),
                onClick = {
                    event(MainEventRt137.OnChangeStatusMock(MockRt137.Start))
                })
            {
                Text(
                    text = stringResource(id = R.string.quiz),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                        color = orange
                    )
                )
            }
        }
    }
}