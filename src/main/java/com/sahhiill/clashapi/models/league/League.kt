package com.sahhiill.clashapi.models.league

import com.sahhiill.clashapi.models.common.IconUrls
import kotlinx.serialization.Serializable

@Serializable
data class League(val name: String, val id: Int, val iconUrls: IconUrls)