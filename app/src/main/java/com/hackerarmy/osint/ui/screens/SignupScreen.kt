package com.hackerarmy.osint.ui.screens

import android.util.Base64
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.security.crypto.EncryptedSharedPreferences
import androidx.security.crypto.MasterKeys

@Composable
fun SignupScreen(navController: NavController) {
    val context = LocalContext.current
    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var success by remember { mutableStateOf<String?>(null) }

    val masterKeyAlias = MasterKeys.getOrCreate(MasterKeys.AES256_GCM_SPEC)
    val sharedPref = EncryptedSharedPreferences.create(
        "hacker_prefs",
        masterKeyAlias,
        context,
        EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
        EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM
    )

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .padding(24.dp)) {
        Spacer(modifier = Modifier.height(40.dp))
        Text("Create Operative", color = Color(0xFF00FF00), fontFamily = FontFamily.Monospace)
        Spacer(modifier = Modifier.height(24.dp))

        Card(modifier = Modifier.fillMaxWidth(), backgroundColor = Color(0xFF081010), shape = RoundedCornerShape(12.dp)) {
            Column(modifier = Modifier.padding(16.dp)) {
                OutlinedTextField(value = username, onValueChange = { username = it }, label = { Text("Username") }, colors = TextFieldDefaults.outlinedTextFieldColors(textColor = Color(0xFF00FF00), focusedBorderColor = Color(0xFF00FF00)))
                Spacer(modifier = Modifier.height(8.dp))
                OutlinedTextField(value = password, onValueChange = { password = it }, label = { Text("Password") }, visualTransformation = PasswordVisualTransformation(), colors = TextFieldDefaults.outlinedTextFieldColors(textColor = Color(0xFF00FF00), focusedBorderColor = Color(0xFF00FF00)))
                Spacer(modifier = Modifier.height(12.dp))
                Button(onClick = {
                    if (username.length < 3 || password.length < 4) return@Button
                    val encoded = Base64.encodeToString(password.toByteArray(), Base64.DEFAULT)
                    sharedPref.edit().putString(username, encoded).apply()
                    success = "Account created — returning to login"
                    navController.navigate("login") {
                        popUpTo("signup") { inclusive = true }
                    }
                }, modifier = Modifier.fillMaxWidth(), colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF00FF00))) {
                    Text("SIGN UP", color = Color.Black)
                }
                success?.let { Text(it, color = Color(0xFF00FF00)) }
            }
        }
    }
}
