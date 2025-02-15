package com.dgb.appjetpackcompose.presentation.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.dgb.appjetpackcompose.presentation.ui.navigation.NavigationActions

@Composable
fun NavigationButtons(
    navigationActions: NavigationActions
){
    Row(
        modifier = Modifier.fillMaxWidth(),
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
                navigationActions.navigateToSeries()
            }
        ) {
            Text("Series Coreanas")
        }
    }
}