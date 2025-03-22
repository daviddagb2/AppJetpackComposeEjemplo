package com.dgb.appjetpackcompose.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dgb.appjetpackcompose.domain.models.MovieItem
import com.dgb.appjetpackcompose.presentation.ui.view.AboutUsScreen
import com.dgb.appjetpackcompose.presentation.ui.view.ContactScreen
import com.dgb.appjetpackcompose.presentation.ui.view.MainScreen
import com.dgb.appjetpackcompose.presentation.ui.view.MovieDetailScreen
import com.dgb.appjetpackcompose.presentation.ui.view.MoviesCatalogScreen
import com.dgb.appjetpackcompose.presentation.ui.view.SeriesScreen
import com.google.gson.Gson
import java.net.URLDecoder
import java.nio.charset.StandardCharsets

@Composable
fun AppNavigation(){

    val navController = rememberNavController()
    val navigationActions = NavigationActions(navController)

    NavHost(
        navController = navController,
        startDestination = AppScreens.MainScreen.route
    ){

        composable(AppScreens.MainScreen.route) {
            MainScreen(navigationActions)
        }

        composable(AppScreens.AboutUsScreen.route) {
            AboutUsScreen(navigationActions)
        }

        composable(AppScreens.SeriesScreen.route) {
            SeriesScreen(navigationActions)
        }

        composable(AppScreens.ContactScreen.route) {
            ContactScreen(navigationActions)
        }


        composable(AppScreens.MoviesScreen.route) {
            MoviesCatalogScreen(navigationActions)
        }

        composable(
            route = AppScreens.MoviesDetailScreen.route,
            arguments = listOf(navArgument("movie") { type = NavType.StringType })
        ) {
            val encodedJson = it.arguments?.getString("movie") ?: ""
            val decodedJson = URLDecoder.decode(encodedJson, StandardCharsets.UTF_8.toString())
            val movie = Gson().fromJson(decodedJson, MovieItem::class.java)

            MovieDetailScreen(movie)
        }

    }

}