package com.example.jetpackcomposeui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackcomposeui.Navigation.AppNavHost

import com.example.jetpackcomposeui.screens.ProductDetailsScreen
import com.example.jetpackcomposeui.screens.ProductScreen
import com.example.jetpackcomposeui.ui.theme.JetpackComposeUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeUITheme {
                // A surface container using the 'background' color from the theme
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ){
                  AppNavHost()
                }
//                Scaffold(
//                    modifier = Modifier.fillMaxSize(),
////                    color = MaterialTheme.colorScheme.background
//                ) { innerPadding->
////                    ProductScreen()
//                    AppNavHost(modifier = Modifier.padding(innerPadding))




            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeUITheme {
        Greeting("Android")
    }
}