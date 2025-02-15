package com.dgb.appjetpackcompose.presentation.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dgb.appjetpackcompose.presentation.ui.components.MainTitle
import com.dgb.appjetpackcompose.presentation.ui.components.NavigationButtons
import com.dgb.appjetpackcompose.presentation.ui.navigation.NavigationActions


@Composable
fun SeriesScreen(navigationActions: NavigationActions){
    Column {
        MainTitle("Pantalla de Series")

        Text("PANTALLA DE SERIES")
        Text("PANTALLA DE SERIES")
        Text("PANTALLA DE SERIES")
        Text("PANTALLA DE SERIES")
        Text("PANTALLA DE SERIES")

        NavigationButtons(navigationActions)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSeriesScreen(){
   // SeriesScreen()
}