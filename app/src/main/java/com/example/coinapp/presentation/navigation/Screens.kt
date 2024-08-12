package com.example.coinapp.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screens {
    @Serializable
    data object MainScreen: Screens()

    @Serializable
    data class DetailScreen(
        val id: String
    ): Screens()
}