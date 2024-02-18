package com.cb.starwarsapp.model

import java.util.*

data class PlanetData(
    val name: String,
    val rotationPeriod: String,
    val orbitalPeriod: String,
    val diameter: String,
    val climate: String,
    val gravity: String,
    val terrain: String,
    val surfaceWater: String,
    val population: String,
    val residents: List<String>,
    val films: List<String>,
    val created: Date,
    val edited: Date,
    val url: String
)
