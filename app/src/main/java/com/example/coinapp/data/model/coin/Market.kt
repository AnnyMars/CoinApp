package com.example.coinapp.data.model.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Market(
    @SerialName("has_trading_incentive")
    val hasTradingIncentive: Boolean,
    @SerialName("identifier")
    val identifier: String,
    @SerialName("name")
    val name: String
)