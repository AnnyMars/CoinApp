package com.example.coinapp.data.model.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class CodeAdditionsDeletions4Weeks(
    @SerialName("additions")
    val additions: Int,
    @SerialName("deletions")
    val deletions: Int
)