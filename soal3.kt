package com.example.composercomposing

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun soal3view() {

    Box(
        modifier=Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    listOf(
                        Color(0xFF18284D),
                        Color(0xFF6B4B88),
                        Color(0xFF8FA6A0)
                    )
                )
            )
    ) {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .background(
                    Color(0xFF3D4166),
                    RoundedCornerShape(topStart = 30.dp,
                        topEnd =30.dp)
                )
                .padding(16.dp)
        ) {

            Text(
                "My Travel",
                fontFamily=FontFamily(Font(R.font.poppins)),
                color = Color.White,
                fontSize=22.sp,
                fontWeight =FontWeight.Bold,
                modifier=Modifier.align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = Modifier.height(14.dp))

            Text(
                "Aurora",
                fontFamily = FontFamily(Font(R.font.poppins)),
                color=Color.White,
                fontSize = 14.sp,
                fontWeight=FontWeight.Bold
            )

            Text(
                "Tromsø, Norway",
                fontFamily=FontFamily(Font(R.font.poppins)),
                color = Color.White,
                fontSize=12.sp
            )

            Spacer(modifier=Modifier.height(8.dp))

            Text(
                "★★★★★   5.0",
                fontFamily = FontFamily(Font(R.font.poppins)),
                color=Color(0xFFFFD447),
                fontSize =14.sp
            )

            Spacer(modifier = Modifier.height(12.dp))

            TextField(
                value="",
                onValueChange={},
                placeholder={
                    Text(
                        "What did you enjoy most about your trip?",
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontSize=9.sp
                    )
                },
                modifier=Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(6.dp),
                colors=TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFDCEEFF),
                    unfocusedContainerColor=Color(0xFFDCEEFF)
                )
            )

            Spacer(modifier = Modifier.height(8.dp))

            TextField(
                value = "",
                onValueChange={},
                placeholder={
                    Text(
                        "What was your favorite spot?",
                        fontFamily=FontFamily(Font(R.font.poppins)),
                        fontSize = 9.sp
                    )
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape=RoundedCornerShape(6.dp),
                colors = TextFieldDefaults.colors(
                    focusedContainerColor=Color(0xFFDCEEFF),
                    unfocusedContainerColor = Color(0xFFDCEEFF)
                )
            )

            Spacer(modifier=Modifier.height(8.dp))

            TextField(
                value="",
                onValueChange = {},
                placeholder={
                    Text(
                        "Anything else you'd like to add?",
                        fontFamily = FontFamily(Font(R.font.poppins)),
                        fontSize=9.sp
                    )
                },
                modifier=Modifier
                    .fillMaxWidth()
                    .height(48.dp),
                shape = RoundedCornerShape(6.dp),
                colors=TextFieldDefaults.colors(
                    focusedContainerColor = Color(0xFFDCEEFF),
                    unfocusedContainerColor=Color(0xFFDCEEFF)
                )
            )

            Spacer(modifier = Modifier.height(10.dp))

            FloatingActionButton(
                onClick={},
                modifier = Modifier
                    .align(Alignment.End)
                    .size(42.dp),
                containerColor=Color(0xFFDCEEFF)
            ) {
                Text(
                    "+",
                    fontSize=22.sp
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun soal3preview() {
    soal3view()
}