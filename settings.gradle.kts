pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://jitpack.io")
    }
}
rootProject.name = "my"
include(":app")

plugin {
    id("com.android.application") version "8.5.0"
    id("org.jetbrains.kotlin.android") version "2.0.20"
    id("com.google.dagger.hilt.android") version "2.51.1"
}
