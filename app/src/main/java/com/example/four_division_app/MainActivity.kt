package com.example.four_division_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.four_division_app.ui.theme.Four_division_appTheme
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Row
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.foundation.layout.fillMaxWidth

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Four_division_appTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Four_division_appTheme {
        DivisionRow(
            title_1st = "Text composable",
            text_1st = "Displays text and follows the recommended Material Design guidelines.",
            bg_color_1st = Color(0xFFEADDFF),
            title_2nd = "Image composable",
            text_2nd = "Creates a composable that lays out and draws a given Painter class object.",
            bg_color_2nd = Color(0xFFD0BCFF),
            title_3rd = "Row composable",
            text_3rd = "A layout composable that places its children in a horizontal sequence.",
            bg_color_3rd = Color(0xFFB69DF8),
            title_4th = "Column composable",
            text_4th = "A layout composable that places its children in a vertical sequence.",
            bg_color_4th = Color(0xFFF6EDFF)
        )
    }
}

@Composable
fun DivisionRow(
    title_1st: String, text_1st: String, bg_color_1st: Color,
    title_2nd: String, text_2nd: String, bg_color_2nd: Color,
    title_3rd: String, text_3rd: String, bg_color_3rd: Color,
    title_4th: String, text_4th: String, bg_color_4th: Color) {
    Column(Modifier.fillMaxWidth()) {
        Row(
            Modifier.weight(1f),
            ) {
            DivisionText(
                title = title_1st,
                text_1 = text_1st,
                bg_color = bg_color_1st,
                modifier = Modifier.weight(1f)
            )
            DivisionText(
                title = title_2nd,
                text_1 = text_2nd,
                bg_color = bg_color_2nd,
                modifier = Modifier.weight(1f)
            )
        }
        Row(Modifier.weight(1f)) {
            DivisionText(
                title = title_3rd,
                text_1 = text_3rd,
                bg_color = bg_color_3rd,
                modifier = Modifier.weight(1f)
            )
            DivisionText(
                title = title_4th,
                text_1 = text_4th,
                bg_color = bg_color_4th,
                modifier = Modifier.weight(1f)
            )
        }
    }
}

@Composable
fun DivisionText(title: String, text_1: String, bg_color: Color, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(bg_color)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = text_1,
            textAlign = TextAlign.Justify
        )
    }
}

