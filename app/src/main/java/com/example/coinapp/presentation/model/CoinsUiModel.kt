package com.example.coinapp.presentation.model

import com.example.coinapp.data.model.coins.CoinsItem
import java.text.NumberFormat
import java.util.Locale

data class CoinsUiModel(
    val id: String,
    val name: String,
    val image: String,
    val currentPrice: String,
    val symbol: String,
    val priceChangePercentage24h: String
)

fun CoinsItem.toUiModel(currency: String): CoinsUiModel {
    return CoinsUiModel(
        id = this.id,
        name = this.name,
        image = this.image,
        currentPrice = formatPrice(this.currentPrice, currency),
        symbol = this.symbol.uppercase(),
        priceChangePercentage24h = "${String.format("%.2f", this.priceChangePercentage24h)}%"
    )
}

fun formatPrice(amount: Double, currencyCode: String): String {
    val locale = when (currencyCode.lowercase()) {
        "usd" -> Locale.US
        "rub" -> Locale("ru", "RU")
        else -> {}
    }

    val format = NumberFormat.getCurrencyInstance(locale as Locale)
    format.currency = java.util.Currency.getInstance(currencyCode.uppercase())

    val formattedPrice = format.format(amount)
    return formattedPrice.replace(" ", "\u00A0")
}