package com.example.coinapp.data.model.coin


import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class CommunityData(
    @SerializedName("facebook_likes")
    val facebookLikes: Any,
    @SerializedName("reddit_accounts_active_48h")
    val redditAccountsActive48h: BigDecimal,
    @SerializedName("reddit_average_comments_48h")
    val redditAverageComments48h: BigDecimal,
    @SerializedName("reddit_average_posts_48h")
    val redditAveragePosts48h: BigDecimal,
    @SerializedName("reddit_subscribers")
    val redditSubscribers: BigDecimal,
    @SerializedName("telegram_channel_user_count")
    val telegramChannelUserCount: Any,
    @SerializedName("twitter_followers")
    val twitterFollowers: BigDecimal
)