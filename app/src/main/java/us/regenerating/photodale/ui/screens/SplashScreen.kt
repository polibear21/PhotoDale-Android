package us.regenerating.photodale.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import us.regenerating.photodale.ui.theme.PhotoDaleBlue
import us.regenerating.photodale.ui.theme.PhotoDaleLightBlue
import us.regenerating.photodale.ui.theme.PhotoDaleLightPurple

@Composable
fun SplashScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        PhotoDaleLightBlue, // Light blue
                        PhotoDaleLightPurple  // Light purple
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "PhotoDale",
            style = TextStyle(
                fontSize = 48.sp,
                fontWeight = FontWeight.Bold,
                color = PhotoDaleBlue // Use consistent blue color
            ),
            textAlign = TextAlign.Center
        )
    }
} 