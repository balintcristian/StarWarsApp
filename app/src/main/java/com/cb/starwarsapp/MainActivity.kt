package com.cb.starwarsapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.cb.starwarsapp.model.PeopleData
import com.cb.starwarsapp.model.FilmData
import com.cb.starwarsapp.model.PlanetData
import com.cb.starwarsapp.service.FilmService
import com.cb.starwarsapp.service.PeopleService
import com.cb.starwarsapp.service.PlanetService
import retrofit2.Response

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val planetService = RetrofitInstance
            .getRetrofitInstace()
            .create(PlanetService::class.java)
        val filmService = RetrofitInstance
            .getRetrofitInstace()
            .create(FilmService::class.java)
        val peopleService = RetrofitInstance
            .getRetrofitInstace()
            .create(PeopleService::class.java)

        val responsePlanetData: LiveData<Response<Planet>> =
            liveData {
                val response = planetService.getPlanets()
                Log.e("aaaaaaaaaaaaaaaaaaaaaaa", "Planet Service response: ${response.body()?.results}")
                emit(response)
            }
        val responseFilmData: LiveData<Response<Film>> =
            liveData {
                val response = filmService.getFilms()
                Log.e("aaaaaaaaaaaaaaaaaaaaaaa", "Film Service response: ${response.body()?.results}")
                emit(response)
            }
        val responsePeopleData: LiveData<Response<People>> =
            liveData {
                val response = peopleService.getPeople()
                Log.e("aaaaaaaaaaaaaaaaaaaaaaa", "People Service response: ${response.body()?.results}")
                emit(response)
            }

        @Composable
        fun MainScreen(navController: NavController) {
            val items = listOf("People", "Films", "Planets")

            LazyColumn {
                items(items.size) { index ->
                    Text(
                        text = items[index],
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 24.dp)
                            .clickable {
                                when (index) {
                                    0 -> navController.navigate("People")
                                    1 -> navController.navigate("Films")
                                    2 -> navController.navigate("Planets")
                                }
                            }
                    )
                }
            }
        }
        @Composable
        fun PeopleScreen(peopleList: List<PeopleData>) {
            LazyColumn() {
                itemsIndexed(peopleList) { index, people ->
                    Text(
                        text = people.name,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }

        @Composable
        fun FilmsScreen(filmList:List<FilmData>) {
            LazyColumn() {
                itemsIndexed(filmList) { index, film ->
                    Text(
                        text = film.title,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }        }
        @Composable
        fun PlanetsScreen(planetList: List<PlanetData>) {
            LazyColumn() {
                itemsIndexed(planetList) { index, planet ->
                    Text(
                        text = planet.name,
                        fontSize = 30.sp,
                        modifier = Modifier.padding(10.dp)
                    )
                }
            }
        }

        setContent {
            val navController = rememberNavController()
            val list1= responsePeopleData.value?.body()?.results?: emptyList()
            val list2= responseFilmData.value?.body()?.results?: emptyList()
            val list3= responsePlanetData.value?.body()?.results ?: emptyList()
            NavHost(navController, startDestination = "main") {
                composable("main") {
                    MainScreen(navController)
                }
                composable("People") {
                    PeopleScreen(list1)
                }
                composable("Films") {
                    FilmsScreen(list2)
                }
                composable("Planets") {
                    PlanetsScreen(list3)
                }
            }
        }




    }
}