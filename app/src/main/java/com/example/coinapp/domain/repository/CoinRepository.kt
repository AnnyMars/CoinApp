package com.example.coinapp.domain.repository

import com.example.coinapp.data.model.coin.Coin
import com.example.coinapp.data.model.coins.CoinsItem
import com.example.coinapp.presentation.utils.ResultState

interface CoinRepository {
    suspend fun fetchCoins(currency: String): ResultState<List<CoinsItem>>

    suspend fun fetchCoinById(id: String): ResultState<Coin>
}