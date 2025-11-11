package com.hackerarmy.osint.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val HackerArmyDarkPalette = darkColors(
    primary = Color(0xFF00FF00),
    primaryVariant = Color(0xFF00D000),
    secondary = Color(0xFF00A0A0),
    background = Color.Black,
    surface = Color(0xFF081010),
    onPrimary = Color.Black,
    onBackground = Color(0xFF00FF00)
)

@Composable
fun HackerArmyTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = HackerArmyDarkPalette,
        typography = Typography(),
        shapes = Shapes(),
        content = content
    )
}
