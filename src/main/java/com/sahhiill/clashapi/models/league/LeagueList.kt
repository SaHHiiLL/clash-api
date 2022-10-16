package com.sahhiill.clashapi.models.league

import kotlinx.serialization.Serializable

@Serializable
data class LeagueList(val items: List<League>)