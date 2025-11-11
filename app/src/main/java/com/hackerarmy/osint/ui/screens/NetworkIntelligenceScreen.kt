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
fun NetworkIntelligenceScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize().background(Color.Black).padding(16.dp)) {
        Text("Network Intelligence", color = Color(0xFF00FF00), fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(12.dp))
        Card(modifier = Modifier.fillMaxWidth(), backgroundColor = Color(0xFF081010)) {
            Column(modifier = Modifier.padding(12.dp)) {
                Text("WHOIS, Port Scan, Subdomain enumeration, DNS lookups (SIMULATED)", color = Color(0xFF00FF00))
                Spacer(modifier = Modifier.height(8.dp))
            }
        }
    }
}
