package com.example.coinapp.presentation.detailscreen.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.example.coinapp.presentation.common.CoinErrorScreen

@Composable
fun DetailErrorScreen(onBackClick: () -> Unit, onButtonClick: () -> Unit){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        DetailTopBar(onBackClick = onBackClick)
        CoinErrorScreen(onButtonClick = onButtonClick)
    }
}