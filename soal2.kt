package com.example.composercomposing

import androidx.compose.foundation.Image
import androidx.compose.foundation.gestures.snapping.SnapPosition
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun soal2view() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFFFA0A4)
    ) {
        Column(modifier = Modifier.fillMaxSize())   {


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 34.dp, vertical = 32.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                
                Text(
                    text = "v",
                    fontSize = 20.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold

                )

                Text(
                    text = "Liked Songs",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,

                )

                Text(
                    text = "•••",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

            }

            Image(painter = painterResource(R.drawable.yesssss), "Image",
                modifier = Modifier.size(320.dp)
                    .align(Alignment.CenterHorizontally))

            Row() {

                Text(
                    text = "Hooligan",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(horizontal = 34.dp, vertical = 15.dp)

                )

                Text(
                    text = "❤",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black,
                    modifier = Modifier.padding(horizontal = 150.dp, vertical = 42.dp)

                )

            }

            Text(
                text = "BTS",
                fontSize = 21.sp,
                color = Color.Black,
                modifier = Modifier.padding(horizontal = 34.dp, vertical = 1.dp)
                    .offset(y = (-70).dp)

            )
            androidx.compose.material3.HorizontalDivider(
                modifier = Modifier.padding(horizontal = 34.dp,
                    ),
                thickness = 6.dp,
                color = Color.Black,

            )
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
                Text(
                    text = "0:12",
                    modifier = Modifier.padding(horizontal = 34.dp, vertical = 10.dp)
                )

                Text(
                    text = "-2:14",
                    modifier = Modifier.padding(horizontal = 34.dp, vertical = 10.dp)

                )
            }

            Image(painter = painterResource(R.drawable.mikel), "Image",
                modifier = Modifier.size(width = 320.dp, height = 80.dp).align(Alignment.CenterHorizontally))


            Spacer(modifier = Modifier.height(40.dp))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp)
                    .padding(horizontal = 25.dp),
                shape = RoundedCornerShape(topStart = 28.dp, topEnd = 28.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color(0xFF45120E)
                )
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState())
                        .padding(24.dp)
                ) {
                    Text(
                        text = "Lyrics",
                        color = Color.White,
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )

                    Text(
                        text = "Watch this, watch this beat goin' hooligan\n" +
                                "We pop out, we actin' a fool again\n" +
                                "I get the text, she tryna see me tonight\n" +
                                "I'm in the city, I'm catchin' a flight\n\n" +
                                "Niggas be clones, copy the style\n" +
                                "I been on top for a minute, a while\n" +
                                "Look at the data, look at the stats\n" +
                                "I put the city right back on the map\n\n" +
                                "Fafa, hit 'em, it's over\n",
                        color = Color.White,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(top = 16.dp)
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun soal2preview() {
    soal2view()
}
