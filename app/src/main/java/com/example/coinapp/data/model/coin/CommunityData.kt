package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CommunityData(
    @SerialName("facebook_likes")
    @Contextual
    val facebookLikes: Any?,
    @SerialName("reddit_accounts_active_48h")
    val redditAccountsActive48h: Int,
    @SerialName("reddit_average_comments_48h")
    val redditAverageComments48h: Double,
    @SerialName("reddit_average_posts_48h")
    val redditAveragePosts48h: Double,
    @SerialName("reddit_subscribers")
    val redditSubscribers: Int,
    @SerialName("telegram_channel_user_count")
    @Contextual
    val telegramChannelUserCount: Any?,
    @SerialName("twitter_followers")
    val twitterFollowers: Int
)