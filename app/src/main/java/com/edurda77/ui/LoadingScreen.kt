package com.edurda77.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.edurda77.R

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

    }
}