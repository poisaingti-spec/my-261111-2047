package com.crafted.my.navigation

sealed class NavDestination(val route: String, val titleRes: Int) {
    object Home : NavDestination("home", com.crafted.my.R.string.title_home)
    object QuickCommands : NavDestination("quick_commands", com.crafted.my.R.string.title_quick_commands)
    object MyCapsules : NavDestination("my_capsules", com.crafted.my.R.string.title_my_capsules)
    object Settings : NavDestination("settings", com.crafted.my.R.string.title_settings)

    // Additional deep‑link or placeholder screens that map 1‑1 to the original activities
    object AssistantHomeInfo : NavDestination("assistant_home_info", com.crafted.my.R.string.assistant_home)
    object Notice : NavDestination("notice", com.crafted.my.R.string.assi_home_menu_tutorials)
    // ... add others if you need explicit routes
}