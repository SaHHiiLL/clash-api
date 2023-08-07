package com.sahhiill.clashapi.models.clan

import kotlinx.serialization.Serializable

@Serializable
data class ClanVersusRankingList(val items: List<ClanBuilderBaseRanking>)