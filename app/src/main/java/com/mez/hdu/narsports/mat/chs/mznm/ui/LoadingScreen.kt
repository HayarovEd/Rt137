package com.mez.hdu.narsports.mat.chs.mznm.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CircularProgressIndicator
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mez.hdu.narsports.mat.chs.mznm.R
import com.mez.hdu.narsports.mat.chs.mznm.ui.theme.orange
import com.mez.hdu.narsports.mat.chs.mznm.ui.theme.white

@Composable
fun LoadingScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            modifier = modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background_loading),
            contentDescription = "",
            contentScale = ContentScale.FillBounds
        )
        CircularProgressIndicator(
            modifier = modifier
                .align(alignment = Alignment.Center)
                .size(135.dp),
            color = orange
        )
        Text(
            modifier = modifier
                .align(alignment = Alignment.BottomCenter)
                .padding(bottom = 55.dp),
            text = stringResource(id = R.string.go_loading),
            style = TextStyle(
                fontSize = 24.sp,
                fontFamily = FontFamily(Font(R.font.inter)),
                fontWeight = FontWeight(600),
                color = white
            )
        )
    }
}