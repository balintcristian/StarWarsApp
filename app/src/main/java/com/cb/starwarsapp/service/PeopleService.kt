package com.cb.starwarsapp.service

import com.cb.starwarsapp.People
import retrofit2.Response
import retrofit2.http.GET

interface PeopleService {
    @GET("/people")
    suspend fun getPeople():Response<People>
}