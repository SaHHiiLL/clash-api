package com.sahhiill.clashapi.models.clanCapital

import kotlinx.serialization.Serializable

@Serializable
data class ClanCapitalMember(
//    "tag": "#QVGP9LPG",
//"name": "lord dragon",
//"attacks": 6,
//"attackLimit": 5,
//"bonusAttackLimit": 1,
//"capitalResourcesLooted": 11380

    val tag: String,
    val name: String,
    val attackLimit: Int,
    val bonusAttackLimit: Int,
    val capitalResourcesLooted: Int,
)