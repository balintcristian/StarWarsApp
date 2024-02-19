package com.cb.starwarsapp.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class PlanetData(
    @SerializedName("name")
    val name: String,
    @SerializedName("rotationPeriod")
    val rotationPeriod: String,
    @SerializedName("orbitalPeriod")
    val orbitalPeriod: String,
    @SerializedName("diameter")
    val diameter: String,
    @SerializedName("climate")
    val climate: String,
    @SerializedName("gravity")
    val gravity: String,
    @SerializedName("terrain")
    val terrain: String,
    @SerializedName("surfaceWater")
    val surfaceWater: String,
    @SerializedName("population")
    val population: String,
    @SerializedName("residents")
    val residents: List<String>,
    @SerializedName("films")
    val films: List<String>,
    @SerializedName("created")
    val created: Date,
    @SerializedName("edited")
    val edited: Date,
    @SerializedName("url")
    val url: String
)
