package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Coin(
    @SerialName("additional_notices")
    val additionalNotices: List<@Contextual Any>?,
    @SerialName("asset_platform_id")
    @Contextual
    val assetPlatformId: Any?,
    @SerialName("block_time_in_minutes")
    val blockTimeInMinutes: Int,
    @SerialName("categories")
    val categories: List<String>,
    @SerialName("community_data")
    val communityData: CommunityData,
    @SerialName("country_origin")
    val countryOrigin: String,
    @SerialName("description")
    val description: Description,
    @SerialName("detail_platforms")
    val detailPlatforms: DetailPlatforms,
    @SerialName("developer_data")
    val developerData: DeveloperData,
    @SerialName("genesis_date")
    val genesisDate: String,
    @SerialName("hashing_algorithm")
    val hashingAlgorithm: String,
    @SerialName("ico_data")
    val icoData: IcoData,
    @SerialName("id")
    val id: String,
    @SerialName("image")
    val image: Image,
    @SerialName("last_updated")
    val lastUpdated: String,
    @SerialName("links")
    val links: LinksX,
    @SerialName("localization")
    val localization: Localization,
    @SerialName("market_cap_rank")
    val marketCapRank: Int,
    @SerialName("market_data")
    val marketData: MarketData,
    @SerialName("name")
    val name: String,
    @SerialName("platforms")
    val platforms: Platforms,
    @SerialName("preview_listing")
    val previewListing: Boolean,
    @SerialName("public_notice")
    @Contextual
    val publicNotice: Any?,
    @SerialName("sentiment_votes_down_percentage")
    val sentimentVotesDownPercentage: Double,
    @SerialName("sentiment_votes_up_percentage")
    val sentimentVotesUpPercentage: Double,
    @SerialName("status_updates")
    val statusUpdates: List<@Contextual Any>?,
    @SerialName("symbol")
    val symbol: String,
    @SerialName("tickers")
    val tickers: List<Ticker>,
    @SerialName("watchlist_portfolio_users")
    val watchlistPortfolioUsers: Int,
    @SerialName("web_slug")
    val webSlug: String
)