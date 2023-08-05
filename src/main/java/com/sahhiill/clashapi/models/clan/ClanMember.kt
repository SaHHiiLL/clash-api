package com.sahhiill.clashapi.models.clan

import com.sahhiill.clashapi.models.league.League
import kotlinx.serialization.Serializable

@Serializable
data class ClanMember(
    val league: League,
    val tag: String,
    val name: String,
    val role: String,
    val expLevel: Int,
    val clanRank: Int,
    val previousClanRank: Int,
    val donations: Int,
    val donationsReceived: Int,
    val trophies: Int,
    val builderBaseTrophies: Int
)