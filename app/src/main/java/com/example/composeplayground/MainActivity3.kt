package com.example.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import com.example.composeplayground.ui.theme.ComposePlaygroundTheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposePlaygroundTheme {
                // A surface container using the 'background' color from the theme
                MaiAppUi()
            }
        }

    }

    @Composable
    fun MaiAppUi() {
        var name by remember { mutableStateOf(0) }
        DemoText(counterParam = name, onCLickedChange = { name++ })
    }

    @Composable
    fun DemoText(counterParam: Int, onCLickedChange: () -> Unit) {

        Button(onClick = onCLickedChange) {
        }
        Text(text = counterParam.toString())

    }

}

