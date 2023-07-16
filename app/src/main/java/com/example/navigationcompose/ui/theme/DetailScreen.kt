package com.example.navigationcompose.ui.theme

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavHostController

@Composable
fun DetailScreen(
    navController: NavHostController,
    id: Int
) {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        val context = LocalContext.current
        Text(
            text = "DetailScreen $id",
            color = Color.Red,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable {
                Toast.makeText(context, "Navigating To Home with $id", Toast.LENGTH_SHORT).show()
                navController.navigate(Screen.Home.route) {
//                    to pop off fragment from backstack
                    popUpTo(Screen.Home.route) {
                        inclusive = true
                    }
                }
            }
        )
    }
}