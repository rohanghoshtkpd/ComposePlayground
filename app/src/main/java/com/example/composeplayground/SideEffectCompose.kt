package com.example.composeplayground

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeplayground.ui.theme.ComposePlaygroundTheme

@Composable
fun DemoText3()
{
    var name by remember{
        mutableStateOf(0,object : SnapshotMutationPolicy<Int> {
        override fun equivalent(a: Int, b: Int): Boolean {
            return true
        }

    })
    }
    Button(onClick = {name++}) {
    }
    Text(text = name.toString())

}






@Preview(showBackground = true)
@Composable
fun DefaultPreview3() {
    ComposePlaygroundTheme {
        DemoText3()

    }
}