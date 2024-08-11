package com.example.coinapp.presentation.mainscreen.components

import androidx.compose.foundation.Image
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
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinapp.R
import com.example.coinapp.ui.theme.robotoFont

@Composable
fun CoinItem() {
    Card(
        modifier = Modifier.fillMaxWidth(),
        onClick = { /*TODO*/ },
        colors = CardDefaults.cardColors().copy(containerColor = Color.White),
        shape = RectangleShape
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 5.dp)
        ) {
            Image(
                modifier = Modifier.size(40.dp),
                imageVector = ImageVector.vectorResource(id = R.drawable.icon_coin_error),
                contentDescription = ""
            )
            Spacer(modifier = Modifier.width(5.dp))
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Bitcoin",
                    style = TextStyle(
                        color = Color.Black,
                        fontFamily = robotoFont,
                        fontWeight = FontWeight(500),
                        fontSize = 16.sp
                    )
                )
                Text(
                    text = "BTC",
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
                    text = "₽ 2,446,730.40",
                    style = TextStyle(
                        color = Color.Black,
                        fontFamily = robotoFont,
                        fontWeight = FontWeight(600),
                        fontSize = 16.sp
                    )
                )
                Text(
                    modifier = Modifier.align(Alignment.End),
                    text = "+ 4.05%",
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

@Preview(showBackground = true)
@Composable
fun PreviewCoinItem() {
    CoinItem()
}