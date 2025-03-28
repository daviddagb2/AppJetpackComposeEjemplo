package com.dgb.appjetpackcompose.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.dgb.appjetpackcompose.presentation.ui.navigation.NavigationActions

@Composable
fun NavigationButtons(
    navigationActions: NavigationActions
){
    Row(
        modifier = Modifier.fillMaxWidth().height(80.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceEvenly
    ){

        Button(
            onClick = {
                navigationActions.navigateToMain()
            }
        ) {
            Text("Inicio")
        }

        Button(
            onClick = {
                navigationActions.navigateToAboutUs()
            }
        ) {
            Text("Acerca de")
        }


        Button(
            onClick = {
                navigationActions.navigateToMovies()
            }
        ) {
            Text("Peliculas")
        }

        Button(
            onClick = {
                navigationActions.navigateToContacts()
            }
        ) {
            Text("Contactos")
        }

        Button(
            onClick = {
                navigationActions.navigateToSeries()
            }
        ) {
            Text("Series Coreanas")
        }
    }
}