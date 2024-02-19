package com.cb.starwarsapp

import com.cb.starwarsapp.model.PeopleData
import com.google.gson.annotations.SerializedName

class People(
    @SerializedName("results")
    val results: ArrayList<PeopleData> // Assuming CharacterData is the data class representing individual character information
)
