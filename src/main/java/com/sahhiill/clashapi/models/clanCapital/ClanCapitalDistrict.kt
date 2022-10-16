package com.sahhiill.clashapi.models.clanCapital

import com.sahhiill.clashapi.models.clanCapital.Attack.ClanCapitalAttacks
import kotlinx.serialization.Serializable

@Serializable
data class ClanCapitalDistrict(
    val id: Int,
    val name: String,
    val districtHallLevel: Int,
    val destructionPercent: Int,
    val attackCount: Int,
    val totalLooted: Int,
    val attacks: List<ClanCapitalAttacks>? = null
)
