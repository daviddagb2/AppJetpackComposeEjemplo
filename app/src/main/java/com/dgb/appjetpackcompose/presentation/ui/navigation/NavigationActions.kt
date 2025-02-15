package com.dgb.appjetpackcompose.presentation.ui.navigation

import androidx.navigation.NavController

class NavigationActions(private val navController: NavController) {

    fun navigateToMain() {
        navController.navigate(AppScreens.MainScreen.route)
    }

    fun navigateToAboutUs() {
        navController.navigate(AppScreens.AboutUsScreen.route)
    }

    fun navigateToSeries() {
        navController.navigate(AppScreens.SeriesScreen.route)
    }
}