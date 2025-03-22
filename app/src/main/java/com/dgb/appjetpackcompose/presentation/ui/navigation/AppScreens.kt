package com.dgb.appjetpackcompose.presentation.ui.navigation

sealed class AppScreens(val route: String){

    data object MainScreen : AppScreens("main_screen")

    data object SeriesScreen : AppScreens("series_screen")

    data object MoviesScreen : AppScreens("movies_screen")

    //data object MoviesDetailScreen : AppScreens("movies_detail_screen")

    data object MoviesDetailScreen : AppScreens("movies_detail_screen/{movie}") {
        fun createRoute(movieJson: String) = "movies_detail_screen/$movieJson"
    }

    data object AboutUsScreen : AppScreens("about_screen")

    data object ContactScreen : AppScreens("contact_screen")

}