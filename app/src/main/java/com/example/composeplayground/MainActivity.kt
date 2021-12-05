package com.example.composeplayground

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                // A surface container using the 'background' color from the theme
                MyAppUI()
            }
        }

    }
}

@Composable
fun MyAppUI() {
    androidx.compose.material.Surface(modifier = Modifier.fillMaxWidth(), color = Color.LightGray) {
        ProfileCard()
    }
}


@Composable
fun ProfileCard() {
    Card(modifier = Modifier.fillMaxWidth(), elevation = 8.dp) {
        (Row(modifier = Modifier.wrapContentSize()) {
            ProfileCardImage()
            ProfileContent()
        })

    }
}

@Composable
fun ProfileContent() {
    TODO("Not yet implemented")
}

@Composable
fun ProfileCardImage() {
    TODO("Not yet implemented")
}


@Preview(showBackground = true, widthDp = 320, uiMode = UI_MODE_NIGHT_YES)
@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    ComposePlaygroundTheme {
        MyAppUI()

    }
}