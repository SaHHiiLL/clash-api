package com.sahhiill.clashapi.models.clanCapital.Attack

import jdk.jfr.Percentage
import kotlinx.serialization.Serializable

@Serializable
data class ClanCapitalAttacks(
    val attacker: ClanCapitalAttacker,
    val destructionPercent: Int,
)
