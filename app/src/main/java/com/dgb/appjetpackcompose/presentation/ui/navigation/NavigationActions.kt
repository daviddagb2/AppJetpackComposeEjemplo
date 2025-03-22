package com.dgb.appjetpackcompose.presentation.ui.navigation

import androidx.navigation.NavController
import com.dgb.appjetpackcompose.domain.models.MovieItem
import com.google.gson.Gson
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

class NavigationActions(private val navController: NavController) {

    fun navigateToMain() {
        navController.navigate(AppScreens.MainScreen.route)
    }

    fun navigateToAboutUs() {
        navController.navigate(AppScreens.AboutUsScreen.route)
    }

    fun navigateToMovies() {
        navController.navigate(AppScreens.MoviesScreen.route)
    }

    /*fun navigateToDetailMovie() {
        navController.navigate(AppScreens.MoviesDetailScreen.route)
    }*/

    fun navigateToDetailMovie(movieItem: MovieItem) {
        val movieJson = Gson().toJson(movieItem)
        val encodedMovie = URLEncoder.encode(movieJson, StandardCharsets.UTF_8.toString())
        navController.navigate(AppScreens.MoviesDetailScreen.createRoute(encodedMovie))
    }

    fun navigateToContacts() {
        navController.navigate(AppScreens.ContactScreen.route)
    }

    fun navigateToSeries() {
        navController.navigate(AppScreens.SeriesScreen.route)
    }


}