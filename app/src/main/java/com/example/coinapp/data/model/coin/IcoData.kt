package com.example.coinapp.data.model.coin


import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class IcoData(
    @SerialName("accepting_currencies")
    val acceptingCurrencies: String,
    @SerialName("amount_for_sale")
    @Contextual
    val amountForSale: Any?,
    @SerialName("base_pre_sale_amount")
    @Contextual
    val basePreSaleAmount: Any?,
    @SerialName("base_public_sale_amount")
    val basePublicSaleAmount: Double,
    @SerialName("bounty_detail_url")
    val bountyDetailUrl: String,
    @SerialName("country_origin")
    val countryOrigin: String,
    @SerialName("description")
    @Contextual
    val description: Any,
    @SerialName("hardcap_amount")
    @Contextual
    val hardcapAmount: Any?,
    @SerialName("hardcap_currency")
    val hardcapCurrency: String,
    @SerialName("ico_end_date")
    val icoEndDate: String,
    @SerialName("ico_start_date")
    val icoStartDate: String,
    @SerialName("kyc_required")
    val kycRequired: Boolean,
    @SerialName("links")
    val links: Links,
    @SerialName("pre_sale_available")
    @Contextual
    val preSaleAvailable: Any?,
    @SerialName("pre_sale_end_date")
    @Contextual
    val preSaleEndDate: Any?,
    @SerialName("pre_sale_ended")
    val preSaleEnded: Boolean,
    @SerialName("pre_sale_start_date")
    @Contextual
    val preSaleStartDate: Any,
    @SerialName("quote_pre_sale_amount")
    @Contextual
    val quotePreSaleAmount: Any?,
    @SerialName("quote_pre_sale_currency")
    val quotePreSaleCurrency: String,
    @SerialName("quote_public_sale_amount")
    val quotePublicSaleAmount: Double,
    @SerialName("quote_public_sale_currency")
    val quotePublicSaleCurrency: String,
    @SerialName("short_desc")
    val shortDesc: String,
    @SerialName("softcap_amount")
    @Contextual
    val softcapAmount: Any?,
    @SerialName("softcap_currency")
    val softcapCurrency: String,
    @SerialName("total_raised")
    @Contextual
    val totalRaised: Any?,
    @SerialName("total_raised_currency")
    val totalRaisedCurrency: String,
    @SerialName("whitelist_available")
    @Contextual
    val whitelistAvailable: Any?,
    @SerialName("whitelist_end_date")
    @Contextual
    val whitelistEndDate: Any?,
    @SerialName("whitelist_start_date")
    @Contextual
    val whitelistStartDate: Any?,
    @SerialName("whitelist_url")
    val whitelistUrl: String
)