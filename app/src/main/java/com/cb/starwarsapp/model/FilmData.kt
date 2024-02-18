package com.cb.starwarsapp.model

import java.util.*

data class FilmData(
    val title: String,
    val episodeId: Int,
    val openingCrawl: String,
    val director: String,
    val producer: String,
    val releaseDate: Date,
    val characters: List<String>,
    val planets: List<String>,
    val starships: List<String>,
    val vehicles: List<String>,
    val species: List<String>,
    val created: Date,
    val edited: Date,
    val url: String
)
