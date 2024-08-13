package com.example.coinapp.presentation.mainscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.pullrefresh.PullRefreshIndicator
import androidx.compose.material.pullrefresh.pullRefresh
import androidx.compose.material.pullrefresh.rememberPullRefreshState
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.example.coinapp.presentation.common.CoinErrorScreen
import com.example.coinapp.presentation.mainscreen.components.CoinItem
import com.example.coinapp.presentation.mainscreen.components.MainToolBar
import com.example.coinapp.presentation.model.toUiModel
import com.example.coinapp.presentation.utils.ResultState
import com.example.coinapp.ui.theme.orangeColor

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun MainScreen(viewModel: MainViewModel, navigateToDetail: (String) -> Unit) {

    var selectedCurrency by remember { mutableStateOf("usd") }

    val isRefreshing = viewModel.isRefreshing.collectAsStateWithLifecycle().value

    val pullToRefreshState = rememberPullRefreshState(
        refreshing = isRefreshing,
        onRefresh = { viewModel.fetchCoins(selectedCurrency) }
    )

    LaunchedEffect(selectedCurrency) {
        viewModel.fetchCoins(selectedCurrency)
    }

    val result = viewModel.coinsState.collectAsStateWithLifecycle().value

    Column(
        modifier = Modifier
            .fillMaxSize()
            .pullRefresh(pullToRefreshState)
    ) {
        MainToolBar(
            onCurrencySelected = { currency ->
                if (selectedCurrency != currency) {
                    selectedCurrency = currency
                    viewModel.fetchCoins(currency)
                }
            }
        )
        when (result) {
            is ResultState.Error -> {
                CoinErrorScreen(onButtonClick = { viewModel.fetchCoins(selectedCurrency) })
            }

            ResultState.Loading -> {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    CircularProgressIndicator(color = orangeColor)
                }
            }

            is ResultState.Success -> {
                val coins = result.data.map { it.toUiModel(selectedCurrency) }
                Box(modifier = Modifier.fillMaxSize()) {
                    LazyColumn {
                        items(coins) { coin ->
                            CoinItem(
                                item = coin,
                                onClick = { coinId -> navigateToDetail(coinId) }
                            )
                        }
                    }
                    PullRefreshIndicator(
                        refreshing = isRefreshing,
                        state = pullToRefreshState,
                        modifier = Modifier.align(Alignment.TopCenter)
                    )
                }

            }
        }
    }
}