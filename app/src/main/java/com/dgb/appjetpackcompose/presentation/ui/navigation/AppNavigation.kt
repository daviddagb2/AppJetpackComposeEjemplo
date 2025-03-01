package com.dgb.appjetpackcompose.presentation.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dgb.appjetpackcompose.presentation.ui.view.AboutUsScreen
import com.dgb.appjetpackcompose.presentation.ui.view.ContactScreen
import com.dgb.appjetpackcompose.presentation.ui.view.MainScreen
import com.dgb.appjetpackcompose.presentation.ui.view.SeriesScreen

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

    }

}