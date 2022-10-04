package com.compose.pixeleperfectdesign

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.compose.pixeleperfectdesign.ui.theme.ComposePixeleperfectdesignTheme
import com.pixeleperfectdesign.compose.dh
import com.pixeleperfectdesign.compose.initSize

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initSize()
        setContent {
            ComposePixeleperfectdesignTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!", Modifier.height(0.10.dh))
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposePixeleperfectdesignTheme {
        Greeting("Android")
    }
}