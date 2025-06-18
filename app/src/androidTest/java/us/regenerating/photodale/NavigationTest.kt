package us.regenerating.photodale

import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class NavigationTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<MainActivity>()

    @Test
    fun testNavigationToAllScreens() {
        // Wait for splash screen to finish
        Thread.sleep(2500)
        
        // Test Home screen is displayed
        composeTestRule.onNodeWithText("PhotoDale").assertExists()
        
        // Navigate to BGReplace screen
        composeTestRule.onNodeWithText("bg_replace").performClick()
        composeTestRule.onNodeWithText("Background Replacement").assertExists()
        
        // Navigate to Engrave screen
        composeTestRule.onNodeWithText("engrave").performClick()
        composeTestRule.onNodeWithText("Identity Engraving").assertExists()
        
        // Navigate to More screen
        composeTestRule.onNodeWithText("more").performClick()
        composeTestRule.onNodeWithText("More Tools").assertExists()
        
        // Navigate to Settings screen
        composeTestRule.onNodeWithText("settings").performClick()
        composeTestRule.onNodeWithText("Settings").assertExists()
        
        // Navigate back to Home screen
        composeTestRule.onNodeWithText("home").performClick()
        composeTestRule.onNodeWithText("PhotoDale").assertExists()
    }
} 