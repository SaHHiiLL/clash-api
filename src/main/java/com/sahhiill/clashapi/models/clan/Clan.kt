package com.sahhiill.clashapi.models.clan

import com.sahhiill.clashapi.models.clan.clanCapital.ClanCapital
import com.sahhiill.clashapi.models.common.BadgeUrls
import com.sahhiill.clashapi.models.common.Label
import com.sahhiill.clashapi.models.common.Language
import com.sahhiill.clashapi.models.common.Location
import com.sahhiill.clashapi.models.war.WarMember
import com.sahhiill.clashapi.models.warleague.WarLeague
import kotlinx.serialization.Serializable

@Serializable
data class Clan(
    val warLeague: WarLeague,
    val memberList: List<ClanMember>,
    val requiredBuilderBaseTrophies: Int,
    val requiredTownhallLevel: Int,
    val requiredTrophies: Int,
    val clanBuilderBasePoints: Int,
    val tag: String,
    val isWarLogPublic: Boolean,
    val warFrequency: String,
    val clanLevel: Int,
    val warWinStreak: Int? = null,
    val warWins: Int? = null,
    val warTies: Int? = null,
    val warLosses: Int? = null,
    val clanPoints: Int,
    val chatLanguage: Language? = null,
    val labels: List<Label>,
    val name: String,
    val location: Location? = null,
    val type: String,
    val members: Int,
    val description: String,
    val badgeUrls: BadgeUrls,
    val clanCapital: ClanCapital,
    val familyFriendly : Boolean
)