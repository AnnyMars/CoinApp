package com.example.coinapp.data.model.coin


import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class DeveloperData(
    @SerializedName("closed_issues")
    val closedIssues: BigDecimal,
    @SerializedName("code_additions_deletions_4_weeks")
    val codeAdditionsDeletions4Weeks: CodeAdditionsDeletions4Weeks,
    @SerializedName("commit_count_4_weeks")
    val commitCount4Weeks: BigDecimal,
    @SerializedName("forks")
    val forks: BigDecimal,
    @SerializedName("last_4_weeks_commit_activity_series")
    val last4WeeksCommitActivitySeries: List<Any>,
    @SerializedName("pull_request_contributors")
    val pullRequestContributors: BigDecimal,
    @SerializedName("pull_requests_merged")
    val pullRequestsMerged: BigDecimal,
    @SerializedName("stars")
    val stars: BigDecimal,
    @SerializedName("subscribers")
    val subscribers: BigDecimal,
    @SerializedName("total_issues")
    val totalIssues: BigDecimal
)