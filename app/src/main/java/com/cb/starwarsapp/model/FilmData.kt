package com.cb.starwarsapp.model

import com.google.gson.annotations.SerializedName
import java.util.*

data class FilmData(
    @SerializedName("title")
    val title: String,
    @SerializedName("episodeId")
    val episodeId: Int,
    @SerializedName("openingCrawl")
    val openingCrawl: String,
    @SerializedName("director")
    val director: String,
    @SerializedName("producer")
    val producer: String,
    @SerializedName("releaseDate")
    val releaseDate: Date,
    @SerializedName("characters")
    val characters: List<String>,
    @SerializedName("planets")
    val planets: List<String>,
    @SerializedName("starhips")
    val starships: List<String>,
    @SerializedName("vehicles")
    val vehicles: List<String>,
    @SerializedName("species")
    val species: List<String>,
    @SerializedName("created")
    val created: Date,
    @SerializedName("edited")
    val edited: Date,
    @SerializedName("url")
    val url: String
)
