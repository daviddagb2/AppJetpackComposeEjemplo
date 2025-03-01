package com.dgb.appjetpackcompose.presentation.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dgb.appjetpackcompose.presentation.ui.components.Caja
import com.dgb.appjetpackcompose.presentation.ui.components.MainTitle
import com.dgb.appjetpackcompose.presentation.ui.components.NavigationButtons
import com.dgb.appjetpackcompose.presentation.ui.navigation.NavigationActions
import com.dgb.appjetpackcompose.presentation.ui.theme.ColorCaja


@Composable
fun AboutUsScreen(
    navigationActions: NavigationActions
){
    Column {
        AboutMainContent()

        NavigationButtons(navigationActions)
    }
}


@Composable
fun AboutMainContent(){
    Column(
        modifier = Modifier.background(Color.White).fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ){
        MainTitle("Pantalla Acerca de")
        Text("Aplicación de ejemplo")
        Text("Version 1.0")

        Caja(valor = "hola")
        Caja(valor = "mundo")
        Caja(valor = "........😁")
        Caja(valor = "hola")
        Caja(valor = "mundo")
        Caja(valor = "........😁")

    }
}


@Preview(showBackground = true, showSystemUi = false)
@Composable
fun PreviewAboutUsScreen(){
    AboutMainContent()
}