package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Ticker(
    @SerialName("base")
    val base: String,
    @SerialName("bid_ask_spread_percentage")
    val bidAskSpreadPercentage: Double,
    @SerialName("coin_id")
    val coinId: String,
    @SerialName("converted_last")
    val convertedLast: ConvertedLast,
    @SerialName("converted_volume")
    val convertedVolume: ConvertedVolume,
    @SerialName("is_anomaly")
    val isAnomaly: Boolean,
    @SerialName("is_stale")
    val isStale: Boolean,
    @SerialName("last")
    val last: Double,
    @SerialName("last_fetch_at")
    val lastFetchAt: String,
    @SerialName("last_traded_at")
    val lastTradedAt: String,
    @SerialName("market")
    val market: Market,
    @SerialName("target")
    val target: String,
    @SerialName("target_coin_id")
    val targetCoinId: String,
    @SerialName("timestamp")
    val timestamp: String,
    @SerialName("token_info_url")
    @Contextual
    val tokenInfoUrl: Any,
    @SerialName("trade_url")
    val tradeUrl: String,
    @SerialName("trust_score")
    val trustScore: String,
    @SerialName("volume")
    val volume: Double
)