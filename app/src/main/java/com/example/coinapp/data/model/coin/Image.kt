package com.example.coinapp.data.model.coin


import com.google.gson.annotations.SerializedName

data class Image(
    @SerializedName("large")
    val large: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("thumb")
    val thumb: String
)