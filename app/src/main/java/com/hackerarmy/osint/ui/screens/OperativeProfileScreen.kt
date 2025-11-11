package com.hackerarmy.osint.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun OperativeProfileScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(Color.Black).padding(16.dp)) {
        Text("Operative Profile", color = Color(0xFF00FF00), fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(12.dp))
        Text("Statistics: Searches: 42 | Alerts: 3", color = Color(0xFF00FF00))
        Spacer(modifier = Modifier.height(12.dp))
        Button(onClick = { /* Secure logout simulation */ }, colors = androidx.compose.material.ButtonDefaults.buttonColors(backgroundColor = Color(0xFF00FF00))) {
            Text("LOGOUT", color = Color.Black)
        }
    }
}
