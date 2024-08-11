package com.example.coinapp.presentation.mainscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.coinapp.presentation.mainscreen.components.CoinItem
import com.example.coinapp.presentation.mainscreen.components.MainToolBar

@Composable
fun MainScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MainToolBar()
        LazyColumn {
            items(40) {
                CoinItem()
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}