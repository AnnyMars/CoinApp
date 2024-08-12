package com.example.coinapp.presentation.detailscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.CachePolicy
import coil.request.ImageRequest
import com.example.coinapp.presentation.detailscreen.components.DetailTopBar
import com.example.coinapp.presentation.model.CoinUiModel

@Composable
fun DetailScreen(model: CoinUiModel, title: String, onBackClick: () -> Unit) {

    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(5.dp)
            .verticalScroll(rememberScrollState())
    ) {
        DetailTopBar(title, onBackClick = onBackClick)
        AsyncImage(
            modifier = Modifier
                .size(90.dp)
                .align(Alignment.CenterHorizontally)
                .padding(top = 10.dp),
            model = ImageRequest.Builder(context).data(model.image).crossfade(true)
                .diskCachePolicy(CachePolicy.ENABLED).build(),
            contentDescription = ""
        )
        Text(
            modifier = Modifier.padding(start = 8.dp, top = 10.dp),
            text = "Описание",
            style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight(500)
            )
        )
        Text(
            modifier = Modifier.padding(start = 8.dp, top = 5.dp),
            text = model.description,
            style = TextStyle(
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight(400)
            )
        )
        Text(
            modifier = Modifier.padding(start = 8.dp, top = 10.dp),
            text = "Категории",
            style = TextStyle(
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight(500)
            )
        )
        Text(
            modifier = Modifier.padding(start = 8.dp, top = 5.dp),
            text = model.categories.joinToString(",").trim(),
            style = TextStyle(
                color = Color.Black,
                fontSize = 16.sp,
                fontWeight = FontWeight(400)
            )
        )
    }
}