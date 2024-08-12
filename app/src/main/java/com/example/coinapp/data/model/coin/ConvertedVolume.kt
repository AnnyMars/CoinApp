package com.example.coinapp.data.model.coin


import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class ConvertedVolume(
    @SerializedName("btc")
    val btc: BigDecimal,
    @SerializedName("eth")
    val eth: BigDecimal,
    @SerializedName("usd")
    val usd: BigDecimal
)