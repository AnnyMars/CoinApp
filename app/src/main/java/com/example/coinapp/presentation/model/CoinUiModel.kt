package com.example.coinapp.presentation.model

import com.example.coinapp.data.model.coin.Coin

data class CoinUiModel(
    val id: String,
    val name: String,
    val image: String,
    val description: String,
    val categories: List<String>
)

fun Coin.toCoinUiModel(): CoinUiModel{
    return CoinUiModel(
        id = this.id,
        name = this.name,
        image = this.image.large,
        description = this.description.en,
        categories = this.categories
    )
}
