package com.example.coinapp.data.remote

import com.example.coinapp.data.model.coin.Coin
import com.example.coinapp.data.model.coins.CoinsItem
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinApi {

    @GET("coins/markets")
    suspend fun getCoins(
        @Query("vs_currency") vsCurrency: String? = null,
        @Query("per_page") perPage: Int = 30,
        @Query("page") page: Int = 1,
    ): List<CoinsItem>

    @GET("/coins/{id}")
    suspend fun getCoinById(
        @Path("id") id: String
    ): Coin
}