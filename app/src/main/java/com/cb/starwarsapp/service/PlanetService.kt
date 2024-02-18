package com.cb.starwarsapp.service

import com.cb.starwarsapp.Planet
import retrofit2.Response
import retrofit2.http.GET

interface PlanetService {
    @GET("/planets")
    suspend fun getPlanets():Response<Planet>
}