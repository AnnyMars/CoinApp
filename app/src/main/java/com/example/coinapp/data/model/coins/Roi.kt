package com.example.coinapp.data.model.coins


import com.google.gson.annotations.SerializedName

data class Roi(
    @SerializedName("currency")
    val currency: String,
    @SerializedName("percentage")
    val percentage: Double,
    @SerializedName("times")
    val times: Double
)