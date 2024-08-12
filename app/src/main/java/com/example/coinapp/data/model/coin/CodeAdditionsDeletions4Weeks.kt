package com.example.coinapp.data.model.coin


import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class CodeAdditionsDeletions4Weeks(
    @SerializedName("additions")
    val additions: BigDecimal,
    @SerializedName("deletions")
    val deletions: BigDecimal
)