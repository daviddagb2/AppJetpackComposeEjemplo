package com.dgb.appjetpackcompose.presentation.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.dgb.appjetpackcompose.presentation.ui.components.MainTitle
import com.dgb.appjetpackcompose.presentation.ui.components.NavigationButtons
import com.dgb.appjetpackcompose.presentation.ui.navigation.NavigationActions


@Composable
fun AboutUsScreen(
    navigationActions: NavigationActions
){
    Column {
        MainTitle("Pantalla Acerca de")
        Text("Aplicación de ejemplo")
        Text("Version 1.0")

        NavigationButtons(navigationActions)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewAboutUsScreen(){
    //AboutUsScreen()
}