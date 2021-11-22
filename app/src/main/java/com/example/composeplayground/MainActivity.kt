package com.example.composeplayground

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
fun MyAppUI()
{
    var shouldShowOnboarding by remember { mutableStateOf(true) }
    if(shouldShowOnboarding)
        OnboardingScreen(onContinueClick = {shouldShowOnboarding = false})
    else
        Greetings()
}

@Composable
fun Greetings(names: List<String> = List(1000){"$it"}) {
    Surface(color = MaterialTheme.colors.background) {
        Column(Modifier.padding(vertical = 4.dp)) {
            LazyColumn{
                items (names ){name->
                    Greeting(name = name)
                }
            }
        }

    }
}

@Composable
fun OnboardingScreen(
    onContinueClick: () -> Unit
) {


    Surface {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to the Basics Codelab!")
            Button(
                modifier = Modifier.padding(vertical = 24.dp),
                onClick = {onContinueClick() }
            ) {
                Text("Continue")
            }
        }
    }
}


@Composable
fun Greeting(name: String) {
    val expanded = remember { mutableStateOf(false) }
    val extraPadding by  animateDpAsState(targetValue =  if (expanded.value) 48.dp else 0.dp, animationSpec = tween(durationMillis = 1000))
    Surface(
        color = MaterialTheme.colors.primary,
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
    ) {
        Row(modifier = Modifier.padding(24.dp)) {
            Column(
                modifier = Modifier
                    .weight(1f)
                    .padding(bottom = extraPadding)
            ) {
                Text(
                    text = "Hello "
                )
                Text(
                    text = name,
                )
            }
            OutlinedButton(onClick = { expanded.value = !expanded.value }) {
                Text(text = if (expanded.value) "Show Less" else "Show More")
            }
        }
    }

}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    ComposePlaygroundTheme {
        MyAppUI()

    }
}