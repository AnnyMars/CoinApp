package com.example.coinapp.data.model.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ConvertedLast(
    @SerialName("btc")
    val btc: Double,
    @SerialName("eth")
    val eth: Double,
    @SerialName("usd")
    val usd: Double
)