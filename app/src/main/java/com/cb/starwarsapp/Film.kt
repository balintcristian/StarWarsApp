package com.cb.starwarsapp

import com.cb.starwarsapp.model.FilmData
import com.google.gson.annotations.SerializedName

class Film(
    @SerializedName("results")
    val results: ArrayList<FilmData>
)