package com.sahhiill.clashapi.models.clan

import kotlinx.serialization.Serializable

@Serializable
data class ClanRankingList(val items: List<ClanRanking>)