package com.aprearo.jsonplaceholder.models

import kotlinx.serialization.Serializable

@Serializable
data class Geolocation(
    val lat: String,
    val lng: String
)
