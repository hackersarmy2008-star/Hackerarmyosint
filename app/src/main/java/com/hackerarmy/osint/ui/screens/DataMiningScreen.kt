package com.hackerarmy.osint.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DataMiningScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(Color.Black).padding(16.dp)) {
        Text("Data Mining Center", color = Color(0xFF00FF00), fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(12.dp))
        Card(modifier = Modifier.fillMaxWidth(), backgroundColor = Color(0xFF081010)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Aggregated profiles: 1,247 | Documents: 892 | Breaches: 3,456 (SIMULATED)", color = Color(0xFF00FF00))
            }
        }
    }
}
