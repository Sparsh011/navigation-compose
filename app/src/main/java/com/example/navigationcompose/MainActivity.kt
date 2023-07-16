package com.example.navigationcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.ui.theme.NavigationComposeTheme
import com.example.navigationcompose.ui.theme.SetupNavGraph

class MainActivity : ComponentActivity() {
    private lateinit var navController : NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationComposeTheme {
                navController = rememberNavController() // allows us to create navcontroller
                SetupNavGraph(navController = navController)
            }
        }
    }
}