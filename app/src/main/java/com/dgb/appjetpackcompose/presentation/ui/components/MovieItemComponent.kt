package com.dgb.appjetpackcompose.presentation.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.dgb.appjetpackcompose.R
import androidx.compose.material3.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.dgb.appjetpackcompose.domain.models.MovieItem

@Composable
fun MovieItemComponent(
    movie: MovieItem,
    onClick: () -> Unit
){

    Column(
        modifier = Modifier.padding(10.dp)
            .width(130.dp)
            .clickable {
               // action.characterDetails.invoke(character.id.toString())
                onClick()
            },
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // val imagenCharacter = character.thumbnail.path + "." + character.thumbnail.extension

        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(movie.poster)
                .crossfade(true)
                .build(),
            placeholder = painterResource(R.drawable.img),
            contentDescription = movie.body,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier
                .height(160.dp)
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp)),
        )

        //Spacer(modifier = Modifier.padding(top = 5.dp))
        Box(modifier = Modifier.height(5.dp).fillMaxWidth())

        Text(
            modifier = Modifier.padding(start = 5.dp, end = 5.dp),
            text = movie.title,
            style = TextStyle(
               // fontFamily = FontFamily(Font(R.font.marvel_regular)),
                fontSize = 12.sp,
            ),
            maxLines = 1,
            overflow = TextOverflow.Ellipsis
        )

        // Spacer(modifier = Modifier.padding(top = 10.dp))
        Box(modifier = Modifier.height(5.dp).fillMaxWidth())

    }
}

@Preview
@Composable
fun PreviewMovieItemComponent(){

    val movieTest =   MovieItem("Shrek", "Un ogro y su amigo burro viven aventuras mientras rescatan a una princesa.", "https://m.media-amazon.com/images/I/51xJbFMRr-L._AC_.jpg")

    MovieItemComponent(movieTest, onClick = {})
}