package com.hackerarmy.osint.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.hackerarmy.osint.ui.screens.*

@Composable
fun AppNavHost(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") { LoginScreen(navController) }
        composable("signup") { SignupScreen(navController) }
        composable("dashboard") { DashboardScreen(navController) }
        composable("search_ops") { SearchOperationsScreen(navController) }
        composable("network_intel") { NetworkIntelligenceScreen(navController) }
        composable("image_intel") { ImageIntelligenceScreen(navController) }
        composable("data_mining") { DataMiningScreen(navController) }
        composable("profile") { OperativeProfileScreen(navController) }
    }
}
