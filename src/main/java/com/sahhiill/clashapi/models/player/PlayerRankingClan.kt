package com.sahhiill.clashapi.models.player

import com.sahhiill.clashapi.models.common.BadgeUrls
import kotlinx.serialization.Serializable

@Serializable
data class PlayerRankingClan(val tag: String, val name: String, val badgeUrls: BadgeUrls)