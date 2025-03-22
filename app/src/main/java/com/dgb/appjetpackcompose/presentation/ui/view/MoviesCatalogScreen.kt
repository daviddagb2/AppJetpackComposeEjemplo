package com.dgb.appjetpackcompose.presentation.ui.view

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dgb.appjetpackcompose.domain.models.MovieItem
import com.dgb.appjetpackcompose.domain.models.MyMessage
import com.dgb.appjetpackcompose.presentation.ui.components.ContactComponent
import com.dgb.appjetpackcompose.presentation.ui.components.MainTitle
import com.dgb.appjetpackcompose.presentation.ui.components.MovieItemComponent
import com.dgb.appjetpackcompose.presentation.ui.components.NavigationButtons
import com.dgb.appjetpackcompose.presentation.ui.navigation.NavigationActions
import com.google.gson.Gson

@Composable
fun MoviesCatalogScreen(
    navigationActions: NavigationActions
){
    Column {
        MainTitle("Listas de Peliculas")

        MoviesMainContent(
            modifier = Modifier
                .weight(1f),
            navigationActions
        )

        NavigationButtons(navigationActions)
    }
}


@Composable
fun MoviesMainContent(
    modifier: Modifier = Modifier,
    navigationActions: NavigationActions?
){

    val listaPeliculas = listOf(
        MovieItem("Avengers: Endgame", "Los Vengadores se enfrentan a Thanos en una batalla final por el destino del universo.", "https://m.media-amazon.com/images/I/81ExhpBEbHL._AC_SY679_.jpg"),
        MovieItem("Inception", "Un ladrón roba secretos del subconsciente y trata de implantar una idea en la mente de un objetivo.", "https://m.media-amazon.com/images/I/51zUbui+gbL._AC_.jpg"),
        MovieItem("The Matrix", "Un hacker descubre que el mundo que conoce es una simulación controlada por máquinas.", "https://m.media-amazon.com/images/I/51EG732BV3L.jpg"),
        MovieItem("Interstellar", "Un grupo de astronautas viaja a través de un agujero de gusano para encontrar un nuevo hogar para la humanidad.", "https://m.media-amazon.com/images/I/91kFYg4fX3L._AC_SL1500_.jpg"),
        MovieItem("The Dark Knight", "Batman enfrenta al Joker, un criminal caótico que amenaza con sumir a Gotham en el caos.", "https://m.media-amazon.com/images/I/51K8ouYrHeL._AC_.jpg"),
        MovieItem("Forrest Gump", "Un hombre con una vida extraordinaria cuenta su historia llena de eventos históricos y emocionales.", "https://m.media-amazon.com/images/I/61+zNdxIMIL._AC_SY741_.jpg"),
        MovieItem("Titanic", "Una historia de amor entre clases sociales a bordo del trágico Titanic.", "https://m.media-amazon.com/images/I/71wPkmzzOEL._AC_SY679_.jpg"),
        MovieItem("Gladiator", "Un general romano es traicionado y regresa como gladiador para vengar la muerte de su familia.", "https://m.media-amazon.com/images/I/51A9VqjBd0L._AC_.jpg"),
        MovieItem("The Shawshank Redemption", "Dos presos desarrollan una amistad mientras buscan la libertad y redención.", "https://m.media-amazon.com/images/I/519NBNHX5BL._AC_.jpg"),
        MovieItem("Pulp Fiction", "Varias historias criminales se entrelazan en este clásico de Tarantino.", "https://m.media-amazon.com/images/I/71c05lTE03L._AC_SY679_.jpg"),
        MovieItem("Jurassic Park", "Un parque temático con dinosaurios clonados se convierte en una pesadilla.", "https://m.media-amazon.com/images/I/81+je1v-QwL._AC_SL1500_.jpg"),
        MovieItem("Fight Club", "Un hombre desilusionado forma un club secreto de peleas para liberar su frustración.", "https://m.media-amazon.com/images/I/81D+KJkO8-L._AC_SY679_.jpg"),
        MovieItem("The Lion King", "La historia de Simba, un león joven que debe reclamar su lugar como rey.", "https://m.media-amazon.com/images/I/81s6DUyQCZL._AC_SY679_.jpg"),
        MovieItem("The Godfather", "Una familia mafiosa lucha por mantener el poder y el respeto.", "https://m.media-amazon.com/images/I/51rOnIjLqzL._AC_.jpg"),
        MovieItem("Spider-Man: No Way Home", "Peter Parker enfrenta multiversos y aliados inesperados para proteger su identidad.", "https://m.media-amazon.com/images/I/71UvbQ0xGgL._AC_SY679_.jpg"),
        MovieItem("Doctor Strange in the Multiverse of Madness", "Doctor Strange explora realidades alternativas para proteger el multiverso.", "https://m.media-amazon.com/images/I/81BDYAvcaNL._AC_SY679_.jpg"),
        MovieItem("Avatar", "Un ex marine viaja al planeta Pandora y se involucra en un conflicto entre humanos y nativos.", "https://m.media-amazon.com/images/I/41kTVLeW1CL._AC_.jpg"),
        MovieItem("Coco", "Un niño mexicano viaja al mundo de los muertos para descubrir su legado familiar.", "https://m.media-amazon.com/images/I/71niXI3lxlL._AC_SY679_.jpg"),
        MovieItem("Up", "Un anciano y un niño viajan en una casa flotante impulsada por globos hacia Sudamérica.", "https://m.media-amazon.com/images/I/91j7dZ1iF8L._AC_SY679_.jpg"),
        MovieItem("Shrek", "Un ogro y su amigo burro viven aventuras mientras rescatan a una princesa.", "https://m.media-amazon.com/images/I/51xJbFMRr-L._AC_.jpg"),
    )

    LazyVerticalGrid (
        columns = GridCells.Adaptive(minSize = 128.dp),
        modifier = modifier
    ){
       /* item {
           // MovieItemComponent()
        } */

        items(listaPeliculas) { movieItem ->
           // MovieItemComponent(movieItem, onClick = {})
            MovieItemComponent(movieItem){
                navigationActions?.navigateToDetailMovie(movieItem)
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun PreviewMoviesMainContent(){
    MoviesMainContent(Modifier, null)
}


