package com.example.coinapp.presentation.detailscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinapp.R
import com.example.coinapp.presentation.detailscreen.components.DetailTopBar

@Composable
fun DetailScreen() {
    Column {
        DetailTopBar()
        Image(
            modifier = Modifier.align(Alignment.CenterHorizontally),
            imageVector = ImageVector.vectorResource(id = R.drawable.icon_coin_error),
            contentDescription = ""
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "Описание",
            style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight(500)
            )
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "wdh98uqwfhsdhfjsdfuiqhwdhquiwd",
            style = TextStyle(
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight(400)
            )
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "Категории",
            style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight(500)
            )
        )
        Text(
            modifier = Modifier.padding(start = 8.dp),
            text = "Smart Contract Platform, Ethereum Ecosystems",
            style = TextStyle(
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight(400)
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewDetailScreen() {
    DetailScreen()
}