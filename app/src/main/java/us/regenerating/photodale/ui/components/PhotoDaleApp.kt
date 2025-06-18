package us.regenerating.photodale.ui.components

import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import us.regenerating.photodale.navigation.Screen
import us.regenerating.photodale.ui.screens.BGReplaceScreen
import us.regenerating.photodale.ui.screens.EngraveScreen
import us.regenerating.photodale.ui.screens.HomeScreen
import us.regenerating.photodale.ui.screens.MoreScreen
import us.regenerating.photodale.ui.screens.SettingsScreen

@Composable
fun PhotoDaleApp(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    
    Scaffold(
        modifier = modifier,
        bottomBar = {
            NavigationBar {
                val navBackStackEntry by navController.currentBackStackEntryAsState()
                val currentDestination = navBackStackEntry?.destination
                
                val items = listOf(
                    Screen.Home,
                    Screen.BGReplace,
                    Screen.Engrave,
                    Screen.More,
                    Screen.Settings
                )
                
                items.forEach { screen ->
                    NavigationBarItem(
                        icon = { Icon(getIconForScreen(screen), contentDescription = null) },
                        label = { Text(screen.route) },
                        selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                        onClick = {
                            navController.navigate(screen.route) {
                                popUpTo(navController.graph.findStartDestination().id) {
                                    saveState = true
                                }
                                launchSingleTop = true
                                restoreState = true
                            }
                        }
                    )
                }
            }
        }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Screen.Home.route,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(Screen.Home.route) { HomeScreen() }
            composable(Screen.BGReplace.route) { BGReplaceScreen() }
            composable(Screen.Engrave.route) { EngraveScreen() }
            composable(Screen.More.route) { MoreScreen() }
            composable(Screen.Settings.route) { SettingsScreen() }
        }
    }
}

fun getIconForScreen(screen: Screen): ImageVector {
    return when (screen) {
        Screen.Home -> Icons.Default.Home
        Screen.BGReplace -> Icons.Default.Build
        Screen.Engrave -> Icons.Default.Build
        Screen.More -> Icons.Default.MoreVert
        Screen.Settings -> Icons.Default.Settings
    }
} 