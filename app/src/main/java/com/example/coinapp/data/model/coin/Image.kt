package com.example.coinapp.data.model.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Image(
    @SerialName("large")
    val large: String,
    @SerialName("small")
    val small: String,
    @SerialName("thumb")
    val thumb: String
)