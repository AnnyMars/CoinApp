package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class MarketData(
    @SerialName("ath")
    val ath: Ath,
    @SerialName("ath_change_percentage")
    val athChangePercentage: AthChangePercentage,
    @SerialName("ath_date")
    val athDate: AthDate,
    @SerialName("atl")
    val atl: Atl,
    @SerialName("atl_change_percentage")
    val atlChangePercentage: AtlChangePercentage,
    @SerialName("atl_date")
    val atlDate: AtlDate,
    @SerialName("circulating_supply")
    val circulatingSupply: Double,
    @SerialName("current_price")
    val currentPrice: CurrentPrice,
    @SerialName("fdv_to_tvl_ratio")
    @Contextual
    val fdvToTvlRatio: Any?,
    @SerialName("fully_diluted_valuation")
    val fullyDilutedValuation: FullyDilutedValuation,
    @SerialName("high_24h")
    val high24h: High24h,
    @SerialName("last_updated")
    val lastUpdated: String,
    @SerialName("low_24h")
    val low24h: Low24h,
    @SerialName("market_cap")
    val marketCap: MarketCap,
    @SerialName("market_cap_change_24h")
    val marketCapChange24h: Long,
    @SerialName("market_cap_change_24h_in_currency")
    val marketCapChange24hInCurrency: MarketCapChange24hInCurrency,
    @SerialName("market_cap_change_percentage_24h")
    val marketCapChangePercentage24h: Double,
    @SerialName("market_cap_change_percentage_24h_in_currency")
    val marketCapChangePercentage24hInCurrency: MarketCapChangePercentage24hInCurrency,
    @SerialName("market_cap_fdv_ratio")
    val marketCapFdvRatio: Double,
    @SerialName("market_cap_rank")
    val marketCapRank: Int,
    @SerialName("max_supply")
    @Contextual
    val maxSupply: Any?,
    @SerialName("mcap_to_tvl_ratio")
    @Contextual
    val mcapToTvlRatio: Any?,
    @SerialName("price_change_24h")
    val priceChange24h: Double,
    @SerialName("price_change_24h_in_currency")
    val priceChange24hInCurrency: PriceChange24hInCurrency,
    @SerialName("price_change_percentage_14d")
    val priceChangePercentage14d: Double,
    @SerialName("price_change_percentage_14d_in_currency")
    val priceChangePercentage14dInCurrency: PriceChangePercentage14dInCurrency,
    @SerialName("price_change_percentage_1h_in_currency")
    val priceChangePercentage1hInCurrency: PriceChangePercentage1hInCurrency,
    @SerialName("price_change_percentage_1y")
    val priceChangePercentage1y: Double,
    @SerialName("price_change_percentage_1y_in_currency")
    val priceChangePercentage1yInCurrency: PriceChangePercentage1yInCurrency,
    @SerialName("price_change_percentage_200d")
    val priceChangePercentage200d: Double,
    @SerialName("price_change_percentage_200d_in_currency")
    val priceChangePercentage200dInCurrency: PriceChangePercentage14dInCurrency,
    @SerialName("price_change_percentage_24h")
    val priceChangePercentage24h: Double,
    @SerialName("price_change_percentage_24h_in_currency")
    val priceChangePercentage24hInCurrency: PriceChangePercentage24hInCurrency,
    @SerialName("price_change_percentage_30d")
    val priceChangePercentage30d: Double,
    @SerialName("price_change_percentage_30d_in_currency")
    val priceChangePercentage30dInCurrency: PriceChangePercentage14dInCurrency,
    @SerialName("price_change_percentage_60d")
    val priceChangePercentage60d: Double,
    @SerialName("price_change_percentage_60d_in_currency")
    val priceChangePercentage60dInCurrency: PriceChangePercentage14dInCurrency,
    @SerialName("price_change_percentage_7d")
    val priceChangePercentage7d: Double,
    @SerialName("price_change_percentage_7d_in_currency")
    val priceChangePercentage7dInCurrency: PriceChangePercentage14dInCurrency,
    @SerialName("roi")
    val roi: Roi,
    @SerialName("total_supply")
    val totalSupply: Double,
    @SerialName("total_value_locked")
    @Contextual
    val totalValueLocked: Any?,
    @SerialName("total_volume")
    val totalVolume: TotalVolume
)