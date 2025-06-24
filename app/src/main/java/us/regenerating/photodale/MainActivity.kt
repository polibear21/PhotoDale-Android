package us.regenerating.photodale

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import us.regenerating.photodale.ui.components.PhotoDaleApp
import us.regenerating.photodale.ui.screens.SplashScreen
import us.regenerating.photodale.ui.theme.PhotoDaleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        
        setContent {
            var isReady by remember { mutableStateOf(false) }
            
            LaunchedEffect(Unit) {
                // Simulate 2 second delay for splash screen
                kotlinx.coroutines.delay(2000)
                isReady = true
            }
            
            PhotoDaleTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    if (!isReady) {
                        SplashScreen()
                    } else {
                        PhotoDaleApp()
                    }
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PhotoDaleTheme {
        PhotoDaleApp()
    }
}