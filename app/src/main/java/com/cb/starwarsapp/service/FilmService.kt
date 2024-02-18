package com.cb.starwarsapp.service

import com.cb.starwarsapp.Film
import retrofit2.Response
import retrofit2.http.GET

interface FilmService {
    @GET("/films")
    suspend fun getFilms():Response<Film>
}