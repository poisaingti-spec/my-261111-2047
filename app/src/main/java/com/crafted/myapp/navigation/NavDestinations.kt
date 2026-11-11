package com.crafted.myapp.navigation

sealed class NavDestination(val route: String, val titleRes: Int) {
    object Home : NavDestination("home", com.crafted.myapp.R.string.title_home)
    object QuickCommands : NavDestination("quick_commands", com.crafted.myapp.R.string.title_quick_commands)
    object MyCapsules : NavDestination("my_capsules", com.crafted.myapp.R.string.title_my_capsules)
    object Settings : NavDestination("settings", com.crafted.myapp.R.string.title_settings)

    // Additional deep‑link or placeholder screens that map 1‑1 to the original activities
    object AssistantHomeInfo : NavDestination("assistant_home_info", com.crafted.myapp.R.string.assistant_home)
    object Notice : NavDestination("notice", com.crafted.myapp.R.string.assi_home_menu_tutorials)
    // ... add others if you need explicit routes
}
