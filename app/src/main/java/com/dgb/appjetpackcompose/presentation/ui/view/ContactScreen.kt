package com.dgb.appjetpackcompose.presentation.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dgb.appjetpackcompose.domain.models.MyMessage
import com.dgb.appjetpackcompose.presentation.ui.components.Caja
import com.dgb.appjetpackcompose.presentation.ui.components.ContactComponent
import com.dgb.appjetpackcompose.presentation.ui.components.MainTitle
import com.dgb.appjetpackcompose.presentation.ui.components.NavigationButtons
import com.dgb.appjetpackcompose.presentation.ui.navigation.NavigationActions


@Composable
fun ContactScreen(
    navigationActions: NavigationActions
){
    Column (
        modifier = Modifier.fillMaxSize()
    ){
        MainTitle("Listas de contactos")

        ContactMainScreen(
            modifier = Modifier
                .weight(1f) // Esto permite que la lista ocupe todo el espacio disponible sin empujar los botones fuera
        )

        NavigationButtons(navigationActions)

    }
}

@Composable
fun ContactMainScreen(modifier: Modifier = Modifier){

    val messages = listOf(
        MyMessage("¡Hola! ¿Cómo estás?", "Row"),
        MyMessage("Bienvenido a la app", "Column"),
        MyMessage("", "Box"),
        MyMessage("Este es un mensaje de prueba", "Row"),
        MyMessage("Jetpack Compose es genial", "Column"),
        MyMessage("Aprendiendo listas en Compose", "LazyColumn"),
        MyMessage("Prueba con un texto más largo para ver cómo se ajusta", "Box"),
        MyMessage("Otro mensaje", "Row"),
        MyMessage("¿Qué tal?", "Column"),
        MyMessage("Esto es solo una prueba", "LazyColumn"),
        MyMessage("¡Funciona perfecto!", "Box"),
        MyMessage("Compose facilita el desarrollo", "Row"),
        MyMessage("Este mensaje tiene más palabras para verificar el tamaño", "Column"),
        MyMessage("Diferentes tipos de UI en Compose", "LazyColumn"),
        MyMessage("Vamos a seguir aprendiendo", "Box")
    )

        LazyColumn(
            modifier = modifier
        ){
            item {
                Text("Marilyn")
            }
            items(messages) { messageItem ->
              ContactComponent(messageItem)
            }
        }
}

@Preview(showBackground = true)
@Composable
fun PreviewContactMainScreen(){
    ContactMainScreen()
}