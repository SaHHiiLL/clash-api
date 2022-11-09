package com.sahhiill.clashapi.models.league

import kotlinx.serialization.Serializable

@Serializable
data class LegendSeasonResult(
    val trophies: Int,
    val id: String? = null,
    val rank: Int? = null
)