package com.example.coinapp.data.model.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Roi(
    @SerialName("currency")
    val currency: String,
    @SerialName("percentage")
    val percentage: Double,
    @SerialName("times")
    val times: Double
)