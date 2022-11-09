package com.sahhiill.clashapi.models.clanCapital

import kotlinx.serialization.Serializable

@Serializable
data class ClanCapital(
    val state: String,
    val startTime: String,
    val endTime: String,
    val capitalTotalLoot: Long,
    val raidsCompleted: Long,
    val totalAttacks: Long,
    val enemyDistrictsDestroyed: Long,
    val offensiveReward: Long,
    val defensiveReward: Long,
    val members: List<ClanCapitalMember>? = null,
    val attackLog: List<ClanCapitalAttackLog>,
    val defenseLog: List<ClanCapitalDefenseLog>,
)