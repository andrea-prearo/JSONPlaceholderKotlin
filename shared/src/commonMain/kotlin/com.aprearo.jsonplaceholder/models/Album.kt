package com.aprearo.jsonplaceholder.models

import kotlinx.serialization.Serializable

@Serializable
data class Album(
    val id: Int,
    val title: String,
    val userId: Int
)
