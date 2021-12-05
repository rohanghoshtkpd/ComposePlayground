package com.example.composeplayground

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeplayground.ui.theme.ComposePlaygroundTheme

@Composable
fun DemoText(counterParam: Int, onCLickedChange: () -> Unit) {

    Button(onClick = onCLickedChange) {
    }
    Text(text = counterParam.toString())

}


@Composable
fun MainScreen() {
    var name by remember { mutableStateOf(0) }
    DemoText(counterParam = name, onCLickedChange = { name++ })


}


@Preview(showBackground = true)
@Composable
fun DefaultPreview1() {
    ComposePlaygroundTheme {
        DemoText(5, {})

    }
}