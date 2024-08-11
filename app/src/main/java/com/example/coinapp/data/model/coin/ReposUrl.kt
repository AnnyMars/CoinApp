package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ReposUrl(
    @SerialName("bitbucket")
    val bitbucket: List<@Contextual Any>?,
    @SerialName("github")
    val github: List<String>
)