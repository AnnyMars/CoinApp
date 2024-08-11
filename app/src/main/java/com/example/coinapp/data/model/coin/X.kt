package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class X(
    @SerialName("contract_address")
    val contractAddress: String,
    @SerialName("decimal_place")
    @Contextual
    val decimalPlace: Any?
)