package com.sahhiill.clashapi.models.player

import kotlinx.serialization.Serializable

@Serializable
data class PlayerVersusRankingList(val items: List<PlayerBuilderBaseRanking>)