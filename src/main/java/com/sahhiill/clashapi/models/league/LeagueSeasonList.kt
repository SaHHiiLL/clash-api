package com.sahhiill.clashapi.models.league

import kotlinx.serialization.Serializable

@Serializable
data class LeagueSeasonList(val items: List<LeagueSeason>)