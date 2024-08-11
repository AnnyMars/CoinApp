package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class DeveloperData(
    @SerialName("closed_issues")
    val closedIssues: Int,
    @SerialName("code_additions_deletions_4_weeks")
    val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks,
    @SerialName("commit_count_4_weeks")
    val commitCount4Weeks: Int,
    @SerialName("forks")
    val forks: Int,
    @SerialName("last_4_weeks_commit_activity_series")
    val last4WeeksCommitActivitySeries: List<@Contextual Any>?,
    @SerialName("pull_request_contributors")
    val pullRequestContributors: Int,
    @SerialName("pull_requests_merged")
    val pullRequestsMerged: Int,
    @SerialName("stars")
    val stars: Int,
    @SerialName("subscribers")
    val subscribers: Int,
    @SerialName("total_issues")
    val totalIssues: Int
)