package com.sahhiill.clashapi.models.clan.clanCapital

import kotlinx.serialization.Serializable

@Serializable
data class District(
    var id: Int,
    var name: String,
    var districtHallLevel: Int
)