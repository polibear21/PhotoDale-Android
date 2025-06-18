# PhotoDale

A professional headshot enhancement Android app built with modern Android development technologies.

## 🎯 Purpose

PhotoDale is a headshot enhancement tool with features like background removal, identity-based engraving, and export capabilities.

## 🏗️ Architecture & Tech Stack

- **Language**: Kotlin
- **Architecture**: Clean Architecture (UI → Domain → Data)
- **UI**: Jetpack Compose
- **Navigation**: Navigation Component with Bottom Navigation
- **DI**: Hilt
- **Asynchronous**: Kotlin Coroutines + Flow
- **Theme**: Material 3 dynamic theming

## 📱 Features Implemented

### ✅ MVP Features (Current)

1. **🟥 Splash Screen**
   - Red square logo centered on screen
   - 2-second duration using Android's splash screen API
   - Smooth transition to Home screen

2. **🏠 Home Screen**
   - "PhotoDale" displayed in large, bold text
   - Professional headshot enhancement description
   - Clean, modern Material 3 design

3. **🧭 Bottom Navigation Bar**
   - TikTok/Instagram-style persistent navigation
   - 5 tabs: Home, BGReplace, Engrave, More, Settings
   - Material 3 NavigationBar implementation

4. **🎨 Theme System**
   - Material 3 dynamic theming
   - System/Light/Dark mode toggle in Settings
   - Follows system theme by default
   - Real-time theme switching

5. **⚙️ Settings Screen**
   - Theme mode selection (System, Light, Dark)
   - Radio button interface
   - Immediate theme application

### 🔄 Placeholder Screens (Ready for Implementation)

- **BGReplace**: Background removal feature stub
- **Engrave**: Identity engraving feature stub  
- **More**: Additional tools placeholder

## 🚀 Getting Started

### Prerequisites

- Android Studio Hedgehog or later
- JDK 17 or later
- Android SDK API 29+ (Android 10+)

### Setup

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd PhotoDale
   ```

2. **Open in Android Studio**
   - Open Android Studio
   - Select "Open an existing project"
   - Navigate to the PhotoDale directory

3. **Sync and Build**
   - Wait for Gradle sync to complete
   - Build the project (Build → Make Project)

4. **Run the App**
   - Connect an Android device or start an emulator
   - Click the Run button (▶️) in Android Studio

## 📁 Project Structure

```
app/src/main/java/us/regenerating/photodale/
├── core/
│   └── theme/
│       └── ThemeManager.kt          # Theme management
├── di/
│   └── AppModule.kt                 # Hilt dependency injection
├── navigation/
│   └── Screen.kt                    # Navigation routes
├── ui/
│   ├── components/
│   │   └── PhotoDaleApp.kt          # Main navigation component
│   ├── screens/
│   │   ├── HomeScreen.kt            # Home screen
│   │   ├── BGReplaceScreen.kt       # Background replacement
│   │   ├── EngraveScreen.kt         # Identity engraving
│   │   ├── MoreScreen.kt            # Additional tools
│   │   ├── SettingsScreen.kt        # Settings and theme
│   │   └── SplashScreen.kt          # Splash screen
│   └── theme/
│       ├── Color.kt                 # Color definitions
│       ├── Theme.kt                 # Material 3 theme
│       └── Type.kt                  # Typography
├── viewmodels/
│   └── MainViewModel.kt             # Main app ViewModel
├── MainActivity.kt                  # Main activity
└── PhotoDaleApplication.kt          # Hilt application class
```

## 🧪 Testing

### Instrumentation Tests

The app includes basic navigation testing:

```bash
./gradlew connectedAndroidTest
```

Tests cover:
- Navigation between all screens
- Splash screen functionality
- Theme switching

## 🎨 Design System

### Colors
- **Primary**: Material 3 dynamic colors
- **Splash**: Red (#F44336) background with white square
- **Theme**: Supports light, dark, and system themes

### Typography
- **Headings**: Large, bold text (32sp)
- **Body**: Standard Material 3 typography
- **Captions**: Smaller, muted text for descriptions

## 🔮 Future Features

### Planned Implementation
- **Background Removal**: MLKit or Remove.bg API integration
- **Identity Engraving**: Custom text/branding overlay
- **Export Tools**: Multiple format support
- **User Authentication**: Account management
- **Credits System**: Usage tracking

### Technical Enhancements
- **ML Integration**: TensorFlow Lite for on-device processing
- **Image Processing**: Advanced photo enhancement algorithms
- **Cloud Storage**: Photo backup and sync
- **Social Features**: Sharing and collaboration

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 🐛 Known Issues

- None currently identified

## 📞 Support

For support and questions, please open an issue in the GitHub repository.

---

**PhotoDale** - Professional headshot enhancement made simple. 