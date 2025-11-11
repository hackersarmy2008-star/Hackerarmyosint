package com.hackerarmy.osint.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun ImageIntelligenceScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(Color.Black).padding(16.dp)) {
        Text("Image Intelligence", color = Color(0xFF00FF00), fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(12.dp))
        Card(modifier = Modifier.fillMaxWidth(), backgroundColor = Color(0xFF081010)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("Upload photo, extract EXIF, reverse image search, facial similarity (SIMULATED)", color = Color(0xFF00FF00))
                Spacer(modifier = Modifier.height(8.dp))
                Button(onClick = { /* pick image */ }, modifier = Modifier.fillMaxWidth(), colors = androidx.compose.material.ButtonDefaults.buttonColors(backgroundColor = Color(0xFF00FF00))) {
                    Text("ANALYZE IMAGE", color = Color.Black)
                }
            }
        }
    }
}
