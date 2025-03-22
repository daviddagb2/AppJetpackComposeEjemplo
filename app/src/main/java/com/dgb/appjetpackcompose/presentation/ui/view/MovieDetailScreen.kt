package com.dgb.appjetpackcompose.presentation.ui.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.dgb.appjetpackcompose.R
import com.dgb.appjetpackcompose.domain.models.MovieItem
import com.dgb.appjetpackcompose.presentation.ui.components.MainTitle


@Composable
fun MovieDetailScreen(
    movieItem: MovieItem
){

    Column (
        modifier = Modifier.fillMaxSize().padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){

        MainTitle(movieItem.title)

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(movieItem.poster)
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.img),
            contentDescription = movieItem.body,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .height(400.dp)
                .width(300.dp)
                .clip(RoundedCornerShape(10.dp)),
        )

        Text(movieItem.body)

    }

}


@Preview(showBackground = true)
@Composable
fun PreviewMovieDetailScreen(){

    val movieTest =   MovieItem("Shrek", "Un ogro y su amigo burro viven aventuras mientras rescatan a una princesa.", "https://m.media-amazon.com/images/I/51xJbFMRr-L._AC_.jpg")

    MovieDetailScreen(movieTest)
}