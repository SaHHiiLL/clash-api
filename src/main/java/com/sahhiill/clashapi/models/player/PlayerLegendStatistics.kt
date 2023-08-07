package com.sahhiill.clashapi.models.player

import com.sahhiill.clashapi.models.league.LegendSeasonResult
import kotlinx.serialization.Serializable


@Serializable
data class PlayerLegendStatistics( // everything is nullable??
        val currentSeason: LegendSeasonResult? = null,
        val previousBuilderBaseSeason: LegendSeasonResult? = null,
        val bestBuilderBaseSeason: LegendSeasonResult? = null,
        val legendTrophies: Int? = null,
        val previousSeason: LegendSeasonResult? = null,
        val bestSeason: LegendSeasonResult? = null
)