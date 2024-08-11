package com.example.coinapp.presentation.mainscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.coinapp.presentation.common.CoinErrorScreen
import com.example.coinapp.presentation.mainscreen.components.CoinItem
import com.example.coinapp.presentation.mainscreen.components.MainToolBar
import com.example.coinapp.presentation.model.toUiModel
import com.example.coinapp.presentation.utils.ResultState

@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {
    var selectedCurrency by remember { mutableStateOf("usd") }

    LaunchedEffect(selectedCurrency) {
        viewModel.fetchCoins(selectedCurrency)
    }

    val result = viewModel.coinsState.collectAsState().value

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        MainToolBar(
            onCurrencySelected = { currency ->
                selectedCurrency = currency
                viewModel.fetchCoins(currency)
            }
        )
        when (result){
            is ResultState.Error -> {
                CoinErrorScreen()
            }
            ResultState.Loading -> {
                CircularProgressIndicator()
            }
            is ResultState.Success -> {
                val coins = result.data.map { it.toUiModel(selectedCurrency) }
                LazyColumn {
                    items(coins){ coin ->
                        CoinItem(item = coin)
                    }
                }
            }
        }
    }
}