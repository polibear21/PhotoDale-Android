package us.regenerating.photodale.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object BGReplace : Screen("bg_replace")
    object Engrave : Screen("engrave")
    object More : Screen("more")
    object Settings : Screen("settings")
}