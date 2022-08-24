package com.lycoon.clashapi.models.clan.clanCapital

import kotlinx.serialization.Serializable

@Serializable
data class ClanCapital (
    val capitalHallLevel: Int,
    val districts: List<District>? = null
)