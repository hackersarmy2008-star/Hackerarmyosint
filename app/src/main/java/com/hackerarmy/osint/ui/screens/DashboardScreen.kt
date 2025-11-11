package com.hackerarmy.osint.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun DashboardScreen(navController: NavController) {
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .padding(16.dp)) {
        Text("HACKER ARMY HQ", color = Color(0xFF00FF00), fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(12.dp))

        Column(modifier = Modifier.fillMaxWidth()) {
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                ModuleCard(title = "Search Ops") { navController.navigate("search_ops") }
                ModuleCard(title = "Network Intel") { navController.navigate("network_intel") }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                ModuleCard(title = "Image Intel") { navController.navigate("image_intel") }
                ModuleCard(title = "Data Mining") { navController.navigate("data_mining") }
            }
            Spacer(modifier = Modifier.height(12.dp))
            Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(12.dp)) {
                ModuleCard(title = "Operative Profile") { navController.navigate("profile") }
                ModuleCard(title = "Settings (Simulated)") { /* settings */ }
            }
        }
    }
}

@Composable
fun ModuleCard(title: String, onClick: (() -> Unit)? = null) {
    Card(modifier = Modifier
        .weight(1f)
        .height(120.dp)
        .clickable(enabled = onClick != null) { onClick?.invoke() }, backgroundColor = Color(0xFF081010), shape = RoundedCornerShape(10.dp)) {
        Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
            Text(title, color = Color(0xFF00FF00), fontFamily = FontFamily.Monospace)
        }
    }
}
