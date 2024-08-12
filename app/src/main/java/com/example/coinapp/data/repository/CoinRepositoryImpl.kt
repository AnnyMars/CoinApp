package com.example.coinapp.data.repository

import com.example.coinapp.data.model.coin.Coin
import com.example.coinapp.data.model.coins.CoinsItem
import com.example.coinapp.data.remote.CoinApi
import com.example.coinapp.domain.repository.CoinRepository
import com.example.coinapp.presentation.utils.ResultState
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val coinApi: CoinApi
): CoinRepository {
    override suspend fun fetchCoins(currency: String): ResultState<List<CoinsItem>> {
        return try {
            val coins = coinApi.getCoins(currency)
            ResultState.Success(coins)
        } catch (e: Exception){
            ResultState.Error(e.localizedMessage ?: "Unknown Error")
        }
    }

    override suspend fun fetchCoinById(id: String): ResultState<Coin> {
        return try {
            val coin = coinApi.getCoinById(id)
            ResultState.Success(coin)
        } catch (e: Exception){
            ResultState.Error(e.localizedMessage?: "Unknown Error")
        }
    }
}