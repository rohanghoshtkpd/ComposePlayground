package com.example.composeplayground

import android.annotation.SuppressLint
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeplayground.ui.theme.ComposePlaygroundTheme

@Composable
fun DemoText()
{
    var name by remember{mutableStateOf(0)}
    Button(onClick = {name++}) {
    }
    Text(text = name.toString())

}






@Preview(showBackground = true)
@Composable
fun DefaultPreview1() {
    ComposePlaygroundTheme {
        DemoText()

    }
}