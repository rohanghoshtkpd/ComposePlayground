package com.example.composeplayground

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                // A surface container using the 'background' color from the theme
                DemoTestUI()
            }
        }
    }

    @Composable
    fun DemoTestUI() {
        Surface(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 10.dp)) {
                Image(
                    painter = painterResource(R.drawable.ic_launcher_background),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(horizontal = 10.dp)
                        .clip(
                            RoundedCornerShape(10.dp)
                        )
                )

                Column(
                    modifier = Modifier.padding(start = 10.dp, end = 15.dp),
                    verticalArrangement = Arrangement.Center,
                ) {
                    Text(
                        text = "Usb Cabel Samsung bla bla bla bla bla jkfnv sfvjkns sfjnv sdfjkn sdfdsfjnk",
                        color = Color.Black,
                        fontWeight = FontWeight(500),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    Text(
                        text = "2 meter",
                        color = Color.Black,
                        fontWeight = FontWeight(300),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(bottom = 5.dp)
                    )
                    Text(
                        text = "Rs 56",
                        color = Color.Black,
                        fontWeight = FontWeight(400),
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis
                    )
                }
            }


        }


    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposePlaygroundTheme {
            DemoTestUI()

        }
    }
}

