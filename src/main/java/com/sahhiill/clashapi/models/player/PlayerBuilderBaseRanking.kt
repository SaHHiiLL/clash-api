package com.sahhiill.clashapi.models.player

import com.sahhiill.clashapi.models.league.BuilderBaseLeague
import kotlinx.serialization.Serializable

@Serializable
data class PlayerBuilderBaseRanking(
    val clan: PlayerRankingClan,
    val versusBattleWins: Int,
    val tag: String,
    val name: String,
    val expLevel: Int,
    val rank: Int,
    val previousRank: Int,
    val builderBaseTrophies: Int,
    val builderBaseLeague : BuilderBaseLeague? = null
)