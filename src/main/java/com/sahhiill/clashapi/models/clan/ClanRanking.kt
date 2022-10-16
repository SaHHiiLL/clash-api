package com.sahhiill.clashapi.models.clan

import com.sahhiill.clashapi.models.common.BadgeUrls
import com.sahhiill.clashapi.models.common.Location
import kotlinx.serialization.Serializable

@Serializable
data class ClanRanking(
    val clanLevel: Int,
    val clanPoints: Int,
    val location: Location,
    val members: Int,
    val tag: String,
    val name: String,
    val rank: Int,
    val previousRank: Int,
    val badgeUrls: BadgeUrls
)