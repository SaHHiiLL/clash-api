package com.sahhiill.clashapi.models.player

import com.sahhiill.clashapi.models.common.Label
import com.sahhiill.clashapi.models.league.League
import kotlinx.serialization.Serializable

@Serializable
data class Player(
    val clan: PlayerClan? = null,
    val league: League? = null,
    val role: String? = null,
    var warPreference: String? = null,
    val attackWins: Int,
    val defenseWins: Int,
    val townHallLevel: Int,
    val townHallWeaponLevel: Int? = null,
    val versusBattleWins: Int,
    val legendStatistics: PlayerLegendStatistics? = null,
    val troops: List<Troop>,
    val heroes: List<Troop>,
    val spells: List<Troop>,
    val labels: List<Label>,
    val tag: String,
    val name: String,
    val expLevel: Int,
    val trophies: Int,
    val bestTrophies: Int,
    val donations: Int,
    val donationsReceived: Int,
    val builderHallLevel: Int? = null,
    val versusTrophies: Int,
    val bestVersusTrophies: Int,
    val warStars: Int,
    val achievements: List<Achievement>,
    val versusBattleWinCount: Int,
    val clanCapitalContributions: Int
)