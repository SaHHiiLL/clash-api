package com.sahhiill.clashapi.models.clan.clanCapital

import kotlinx.serialization.Serializable

@Serializable
data class ClanCapital (
    val capitalHallLevel: Int? = null,
    val districts: List<District>? = null
)