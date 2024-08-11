package com.example.coinapp.data.model.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class PriceChangePercentage24hInCurrency(
    @SerialName("price_change_percentage_24h_in_currency")
    val priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrencyX
)