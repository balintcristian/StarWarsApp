package com.cb.starwarsapp

import com.cb.starwarsapp.model.PlanetData
import com.google.gson.annotations.SerializedName

class Planet(
    @SerializedName("results")
    val results: ArrayList<PlanetData>
)