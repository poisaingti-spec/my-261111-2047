# my: open in Android Studio

1. Unzip, then in Android Studio choose **File > Open** and pick this folder.
2. Wait for the Gradle sync (the first one downloads Gradle 9.6.1 and the libraries).
3. **Build > Build APK(s)**, or press Run.

## Build tools in this project

- Gradle: 9.6.1 (wrapper included: `gradlew`, `gradlew.bat`, `gradle/wrapper/`)
- Android Gradle Plugin: 9.5.1
- Kotlin: 2.4.21
- JDK: 17 or newer (Android Studio's bundled JDK is fine)
- Versions were checked online when this zip was made.

`local.properties` is not included on purpose: Android Studio creates it with the path to your own SDK.
On macOS/Linux run `chmod +x gradlew` once before using the command line.

## What was added or changed automatically

- Added missing project files: app/proguard-rules.pro.
- Android Gradle Plugin updated 8.7.3 → 9.5.1.
- Kotlin updated 2.2.20 → 2.4.21.
- Removed the separate Kotlin Android plugin: AGP 9.5.1 has Kotlin built in.
- Removed the outdated package attribute from AndroidManifest.xml (the namespace is set in Gradle).
- The manifest names 12 class(es) the project had no code for; simple stand-ins were created: com.crafted.my.ui.screens.AssistantHomeMainActivity, com.crafted.my.ui.screens.AssistantHomeInfoActivity, com.crafted.my.ui.screens.AssistantHomeAliasActivity, com.crafted.my.ui.screens.NoticeActivity, com.crafted.my.ui.screens.PreferredCapsuleActivity, com.crafted.my.ui.screens.DeviceSpecificActivity, com.crafted.my.ui.screens.ReportActivity, com.crafted.my.ui.screens.MyCapsulesActivity, com.crafted.my.ui.screens.NoticeDetailActivity, com.crafted.my.ui.screens.DeepLinkActivity, com.crafted.my.ui.screens.DeepLinkPublicActivity, com.crafted.my.ui.screens.QuickCommandListActivity.
- Created 1 stand-in resource(s) that the code refers to but the project did not define (see res/values/studio_generated*.xml, drawable, mipmap, xml).
- Imports that point to code not present in the project (1); ask for a fix round for these: com.crafted.my.ui.screens. (used in NavGraph.kt).
- Gradle wrapper (Gradle 9.6.1): gradle/wrapper/gradle-wrapper.properties, gradle/wrapper/gradle-wrapper.jar, gradlew, gradlew.bat.
