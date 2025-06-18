package us.regenerating.photodale.core.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

enum class ThemeMode {
    SYSTEM,
    LIGHT,
    DARK
}

class ThemeManager {
    var currentTheme by mutableStateOf(ThemeMode.SYSTEM)
        private set

    fun setTheme(theme: ThemeMode) {
        currentTheme = theme
    }

    @Composable
    fun isDarkTheme(): Boolean {
        return when (currentTheme) {
            ThemeMode.SYSTEM -> isSystemInDarkTheme()
            ThemeMode.LIGHT -> false
            ThemeMode.DARK -> true
        }
    }
} 