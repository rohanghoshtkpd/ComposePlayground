package com.example.composeplayground

import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
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
        DemoViewPager()
    }
}


@Composable
fun DemoViewPager() {
    Row(horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(5.dp)) {
        Button(onClick = {}, modifier = Modifier
            .weight(1f)
            .padding(5.dp, 0.dp)) {
            Text(text = "tan1")
        }
        Button(onClick = {}, modifier = Modifier
            .weight(1f)
            .padding(5.dp, 0.dp)) {
            Text(text = "tab2")
        }
    }
}


@Preview(showBackground = true, widthDp = 320, uiMode = UI_MODE_NIGHT_YES)
@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    ComposePlaygroundTheme {
        MyAppUI()

    }
}