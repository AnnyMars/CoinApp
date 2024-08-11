package com.example.coinapp.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinapp.R
import com.example.coinapp.ui.theme.robotoFont

@Composable
fun CoinErrorScreen() {

    val text = buildAnnotatedString {
        withStyle(
            SpanStyle(
                fontFamily = robotoFont,
                fontWeight = FontWeight(400),
                fontSize = 16.sp,

                )
        ) {
            append("Произошла какая-то ошибка :(\n")
        }
        withStyle(
            SpanStyle(
                fontFamily = robotoFont,
                fontWeight = FontWeight(400),
                fontSize = 16.sp
            )
        ) {
            append("Попробуем снова?")
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.weight(0.5f))
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.icon_coin_error),
            contentDescription = ""
        )
        Spacer(modifier = Modifier.height(7.dp))
        Text(
            text = text,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { /*TODO*/ },
            shape = RoundedCornerShape(10),
            colors = ButtonDefaults.buttonColors().copy(containerColor = Color(0xFFFF9F00))
        ) {
            Text(
                modifier = Modifier.padding(horizontal = 20.dp),
                text = "Попробовать".uppercase()
            )
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCoinErrorScreen() {
    CoinErrorScreen()
}