package com.dgb.appjetpackcompose.presentation.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.dgb.appjetpackcompose.domain.models.MyMessage

@Composable
fun ContactComponent(message: MyMessage){
    val estiloCaja = Modifier
        .padding(4.dp)
        .fillMaxWidth()
        .padding(8.dp)


    OutlinedCard(
        modifier = estiloCaja,
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        ),
    ){
        Column(
            modifier = Modifier.padding(horizontal = 20.dp)
        ){
            Text(
                message.title,
                style = TextStyle(
                    fontSize = 20.sp
                )
            )

            Box(modifier = Modifier.height(10.dp))

            Text(
                message.body,
                style = TextStyle(
                    fontSize = 14.sp
                )
            )

            Box(modifier = Modifier.height(3.dp))
        }
    }
}

@Preview
@Composable
fun PreviewContactComponent() {
    val msg = MyMessage("Hola Bienvenido", "Column")
    ContactComponent(msg)
}
