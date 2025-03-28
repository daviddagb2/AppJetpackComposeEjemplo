package com.dgb.appjetpackcompose.presentation.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dgb.appjetpackcompose.presentation.ui.components.MainTitle
import com.dgb.appjetpackcompose.presentation.ui.components.NavigationButtons
import com.dgb.appjetpackcompose.presentation.ui.navigation.AppScreens
import com.dgb.appjetpackcompose.presentation.ui.navigation.NavigationActions

@Composable
fun MainScreen(
    navigationActions: NavigationActions
){
    Column(){

        MainTitle("Pantalla Principal")
        NavigationButtons(navigationActions)

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainScreen(){
  //  MainScreen()
}
