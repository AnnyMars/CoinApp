package com.example.coinapp.data.model.coin


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Localization(
    @SerialName("ar")
    val ar: String,
    @SerialName("bg")
    val bg: String,
    @SerialName("cs")
    val cs: String,
    @SerialName("da")
    val da: String,
    @SerialName("de")
    val de: String,
    @SerialName("el")
    val el: String,
    @SerialName("en")
    val en: String,
    @SerialName("es")
    val es: String,
    @SerialName("fi")
    val fi: String,
    @SerialName("fr")
    val fr: String,
    @SerialName("he")
    val he: String,
    @SerialName("hi")
    val hi: String,
    @SerialName("hr")
    val hr: String,
    @SerialName("hu")
    val hu: String,
    @SerialName("id")
    val id: String,
    @SerialName("it")
    val `it`: String,
    @SerialName("ja")
    val ja: String,
    @SerialName("ko")
    val ko: String,
    @SerialName("lt")
    val lt: String,
    @SerialName("nl")
    val nl: String,
    @SerialName("no")
    val no: String,
    @SerialName("pl")
    val pl: String,
    @SerialName("pt")
    val pt: String,
    @SerialName("ro")
    val ro: String,
    @SerialName("ru")
    val ru: String,
    @SerialName("sk")
    val sk: String,
    @SerialName("sl")
    val sl: String,
    @SerialName("sv")
    val sv: String,
    @SerialName("th")
    val th: String,
    @SerialName("tr")
    val tr: String,
    @SerialName("uk")
    val uk: String,
    @SerialName("vi")
    val vi: String,
    @SerialName("zh")
    val zh: String,
    @SerialName("zh-tw")
    val zhTw: String
)