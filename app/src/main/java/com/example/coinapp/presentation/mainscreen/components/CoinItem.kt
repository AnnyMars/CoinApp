package com.example.coinapp.presentation.mainscreen.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.coinapp.presentation.model.CoinsUiModel
import com.example.coinapp.ui.theme.robotoFont

@Composable
fun CoinItem(item: CoinsUiModel) {

    val context = LocalContext.current

    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = { /*TODO*/ },
        colors = CardDefaults.cardColors().copy(containerColor = Color.White),
        shape = RectangleShape
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 5.dp)
        ) {
            AsyncImage(
                modifier = Modifier.size(40.dp),
                model = ImageRequest.Builder(context).data(item.image).build(),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(5.dp))
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = item.name,
                    style = TextStyle(
                        color = Color.Black,
                        fontFamily = robotoFont,
                        fontWeight = FontWeight(500),
                        fontSize = 16.sp
                    )
                )
                Text(
                    text = item.symbol,
                    style = TextStyle(
                        color = Color.Gray,
                        fontFamily = robotoFont,
                        fontWeight = FontWeight(400),
                        fontSize = 14.sp
                    )
                )
            }
            Spacer(modifier = Modifier.weight(1f))
            Column {
                Text(
                    text = item.currentPrice,
                    style = TextStyle(
                        color = Color.Black,
                        fontFamily = robotoFont,
                        fontWeight = FontWeight(600),
                        fontSize = 16.sp
                    )
                )
                Text(
                    modifier = Modifier.align(Alignment.End),
                    text = item.priceChangePercentage24h,
                    style = TextStyle(
                        color = Color.Gray,
                        fontFamily = robotoFont,
                        fontWeight = FontWeight(400),
                        fontSize = 14.sp
                    )
                )
            }
        }
    }
}