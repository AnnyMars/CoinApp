package com.example.coinapp.data.model.coin


import com.google.gson.annotations.SerializedName

data class PriceChangePercentage24hInCurrency(
    @SerializedName("price_change_percentage_24h_in_currency")
    val priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrencyX
)