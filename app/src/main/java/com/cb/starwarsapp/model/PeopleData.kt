package com.cb.starwarsapp.model

import com.google.gson.annotations.SerializedName
import java.util.Date
data class PeopleData(
    @SerializedName("name")
    val name: String,
    @SerializedName("height")
    val height: String,
    @SerializedName("mass")
    val mass: String,
    @SerializedName("hairColor")
    val hairColor: String,
    @SerializedName("skinColor")
    val skinColor: String,
    @SerializedName("eyeColor")
    val eyeColor: String,
    @SerializedName("birthYear")
    val birthYear: String,
    @SerializedName("gender")
    val gender: String,
    @SerializedName("homeworld")
    val homeworld: String,
    @SerializedName("films")
    val films: List<String>,
    @SerializedName("species")
    val species: List<String>,
    @SerializedName("vehicles")
    val vehicles: List<String>,
    @SerializedName("starhips")
    val starships: List<String>,
    @SerializedName("created")
    val created: Date,
    @SerializedName("edited")
    val edited: Date,
    @SerializedName("url")
    val url: String
)