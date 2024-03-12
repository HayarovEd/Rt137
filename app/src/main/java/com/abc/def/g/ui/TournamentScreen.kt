package com.abc.def.g.ui

import androidx.activity.compose.BackHandler
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.abc.def.g.R
import com.abc.def.g.domain.model.GameRt137
import com.abc.def.g.domain.utils.formatDate
import com.abc.def.g.domain.utils.fromHex
import com.abc.def.g.ui.state.MainEventRt137
import com.abc.def.g.ui.state.MockRt137
import com.abc.def.g.ui.theme.black
import com.abc.def.g.ui.theme.grey
import com.abc.def.g.ui.theme.orange
import com.abc.def.g.ui.theme.white

@Composable
fun TournamentScreen(
    modifier: Modifier = Modifier,
    games: List<GameRt137>,
    error: String?,
    event: (MainEventRt137) -> Unit
) {
    BackHandler {
        event(MainEventRt137.OnChangeStatusMock(MockRt137.Selector))
    }
    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = {
            Text(
                modifier = modifier
                    .padding(top = 16.dp, start = 24.dp),
                text = stringResource(id = R.string.statistic),
                style = TextStyle(
                    fontSize = 20.sp,
                    fontFamily = FontFamily(Font(R.font.inter)),
                    fontWeight = FontWeight(400),
                    color = black
                )
            )
        },
        containerColor = white
    ) { paddings ->
        if (error != null) {
            Box(
                modifier = modifier
                    .padding(paddings)
                    .fillMaxSize(),
            ) {
                Text(
                    modifier = modifier
                        .align(Alignment.Center)
                        .fillMaxWidth(),
                    text = stringResource(id = R.string.error),
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(400),
                        color = black,
                        textAlign = TextAlign.Center
                    )
                )
            }
        } else {
            if (games.isEmpty()) {
                Box(
                    modifier = modifier
                        .padding(paddings)
                        .fillMaxSize(),
                ) {
                    Text(
                        modifier = modifier
                            .align(Alignment.Center)
                            .fillMaxWidth(),
                        text = stringResource(id = R.string.data_empty),
                        style = TextStyle(
                            fontSize = 20.sp,
                            fontFamily = FontFamily(Font(R.font.inter)),
                            fontWeight = FontWeight(400),
                            color = black,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            } else {
                LazyColumn(
                    modifier = modifier
                        .padding(paddings)
                        .fillMaxWidth()
                        .padding(20.dp),
                    verticalArrangement = Arrangement.spacedBy(15.dp)
                ) {
                    items(games) { game ->

                        Card(
                            modifier = modifier
                                .fillMaxWidth(),
                            colors = CardDefaults.cardColors(
                                containerColor = orange
                            ),
                            shape = RoundedCornerShape(16.dp),
                            border = BorderStroke(1.dp, grey),
                        ) {
                            Column(
                                modifier = modifier
                                    .fillMaxWidth()
                                    .padding(24.dp),
                            ) {
                                val stringDate = formatDate(game.timeStart)
                                if (stringDate != null) {
                                    Text(
                                        modifier = modifier
                                            .fillMaxWidth(),
                                        text = stringDate,
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(400),
                                            color = black,
                                            textAlign = TextAlign.Center
                                        )
                                    )
                                    Spacer(modifier = modifier.height(10.dp))
                                }
                                Row(
                                    modifier = modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column {
                                        Text(
                                            text = game.awaySymbol,
                                            style = TextStyle(
                                                fontSize = 10.sp,
                                                fontFamily = FontFamily(Font(R.font.inter)),
                                                fontWeight = FontWeight(400),
                                                color = grey
                                            )
                                        )
                                        Text(
                                            text = game.awayTeam,
                                            style = TextStyle(
                                                fontSize = 14.sp,
                                                fontFamily = FontFamily(Font(R.font.inter)),
                                                fontWeight = FontWeight(600),
                                                color = if (game.isHomeWin) grey else black
                                            )
                                        )
                                    }
                                    Text(
                                        text = game.awayScore.toString(),
                                        style = TextStyle(
                                            fontSize = 24.sp,
                                            fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(400),
                                            color = if (game.isHomeWin) grey else black
                                        )
                                    )
                                }
                                Spacer(modifier = modifier.height(16.dp))
                                Row(
                                    modifier = modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.SpaceBetween,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Column {
                                        Text(
                                            text = game.homeSymbol,
                                            style = TextStyle(
                                                fontSize = 10.sp,
                                                fontFamily = FontFamily(Font(R.font.inter)),
                                                fontWeight = FontWeight(400),
                                                color = grey
                                            )
                                        )
                                        Text(
                                            text = game.homeTeam,
                                            style = TextStyle(
                                                fontSize = 14.sp,
                                                fontFamily = FontFamily(Font(R.font.inter)),
                                                fontWeight = FontWeight(600),
                                                color = if (game.isHomeWin) black else grey
                                            )
                                        )
                                    }
                                    Text(
                                        text = game.homeScore.toString(),
                                        style = TextStyle(
                                            fontSize = 24.sp,
                                            fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(400),
                                            color = if (game.isHomeWin) black else grey
                                        )
                                    )
                                }
                                Spacer(modifier = modifier.height(16.dp))
                                Row(
                                    modifier = modifier
                                        .fillMaxWidth(),
                                    horizontalArrangement = Arrangement.Center,
                                    verticalAlignment = Alignment.CenterVertically
                                ) {
                                    Text(
                                        text = game.awaySymbol,
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(400),
                                            color = grey
                                        )
                                    )
                                    Spacer(modifier = modifier.width(5.dp))
                                    Text(
                                        text = game.awayRate.toString(),
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(400),
                                            color = grey
                                        )
                                    )
                                    Spacer(modifier = modifier.width(10.dp))
                                    Text(
                                        text = stringResource(id = R.string.vs),
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(400),
                                            color = black
                                        )
                                    )
                                    Spacer(modifier = modifier.width(10.dp))
                                    Text(
                                        text = game.homeRate.toString(),
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(400),
                                            color = grey
                                        )
                                    )
                                    Spacer(modifier = modifier.width(5.dp))
                                    Text(
                                        text = game.homeSymbol,
                                        style = TextStyle(
                                            fontSize = 10.sp,
                                            fontFamily = FontFamily(Font(R.font.inter)),
                                            fontWeight = FontWeight(400),
                                            color = grey
                                        )
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}