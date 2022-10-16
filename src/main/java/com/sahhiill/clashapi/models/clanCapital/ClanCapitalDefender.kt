package com.sahhiill.clashapi.models.clanCapital

import com.sahhiill.clashapi.models.common.BadgeUrls
import kotlinx.serialization.Serializable

@Serializable
data class ClanCapitalDefender(
    val tag: String,
    val name: String,
    val level: Long,
    val badgeUrls: BadgeUrls
)
