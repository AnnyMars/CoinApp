package com.example.coinapp.presentation.mainscreen.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.coinapp.presentation.utils.Currency
import com.example.coinapp.ui.theme.robotoFont

@Composable
fun MainToolBar() {

    var selectedCurrency by remember { mutableStateOf(Currency.USD) }

    Column {
        Text(
            text = "Список криптовалют",
            color = Color.Black,
            style = TextStyle(
                fontWeight = FontWeight(500),
                fontSize = 24.sp,
                fontFamily = robotoFont
            )
        )
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            AssistChip(
                onClick = { selectedCurrency = Currency.USD },
                label = { Text(modifier = Modifier.padding(horizontal = 10.dp), text = "USD", color = Color(0xFFFFAD25)) },
                colors = AssistChipDefaults.assistChipColors()
                    .copy(containerColor = Color(0xFFFF9F00).copy(alpha = 0.2f)),
                border = BorderStroke(width = 0.dp, color = Color.Transparent),
                shape = RoundedCornerShape(60)
            )
            Spacer(modifier = Modifier.width(15.dp))
            AssistChip(
                onClick = { selectedCurrency = Currency.RUB },
                label = { Text(modifier = Modifier.padding(horizontal = 10.dp), text = "RUB", color = Color.Black) },
                colors = AssistChipDefaults.assistChipColors()
                    .copy(containerColor = Color(0x0000001F).copy(alpha = 0.12f)),
                border = BorderStroke(width = 0.dp, color = Color.Transparent),
                shape = RoundedCornerShape(60)
            )
        }
        HorizontalDivider(thickness = 2.dp)
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewMainToolBar() {
    MainToolBar()
}