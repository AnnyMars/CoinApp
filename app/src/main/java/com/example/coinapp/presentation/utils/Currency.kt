package com.example.coinapp.presentation.utils

enum class Currency {
    USD, RUB
}

object CurrencyConverter {
    private const val USD_TO_RUB = 74.0

    fun convertToRubles(usd: Double): Double {
        return usd * USD_TO_RUB
    }

    fun convertToDollars(rub: Double): Double {
        return rub / USD_TO_RUB
    }
}