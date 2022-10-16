package com.sahhiill.clashapi.models.clanCapital

import kotlinx.serialization.Serializable

@Serializable
data class ClanCapitalAttackLog(
    val defender: ClanCapitalDefender,
    val attackCount: Long,
    val districtCount: Long,
    val districtsDestroyed: Long,
    val districts: List<ClanCapitalDistrict>
)
