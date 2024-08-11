package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class LinksX(
    @SerialName("announcement_url")
    val announcementUrl: List<String>,
    @SerialName("bitcointalk_thread_identifier")
    @Contextual
    val bitcointalkThreadIdentifier: Any?,
    @SerialName("blockchain_site")
    val blockchainSite: List<String>,
    @SerialName("chat_url")
    val chatUrl: List<String>,
    @SerialName("facebook_username")
    val facebookUsername: String,
    @SerialName("homepage")
    val homepage: List<String>,
    @SerialName("official_forum_url")
    val officialForumUrl: List<String>,
    @SerialName("repos_url")
    val reposUrl: ReposUrl,
    @SerialName("subreddit_url")
    val subredditUrl: String,
    @SerialName("telegram_channel_identifier")
    val telegramChannelIdentifier: String,
    @SerialName("twitter_screen_name")
    val twitterScreenName: String,
    @SerialName("whitepaper")
    val whitepaper: String
)