package com.crafted.my.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.crafted.my.ui.screens.*

@Composable
fun AppNavGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = NavDestination.Home.route,
        modifier = modifier
    ) {
        composable(NavDestination.Home.route) {
            HomeScreen(onNavigate = { navController.navigate(it.route) })
        }
        composable(NavDestination.QuickCommands.route) {
            QuickCommandsScreen()
        }
        composable(NavDestination.MyCapsules.route) {
            MyCapsulesScreen()
        }
        composable(NavDestination.Settings.route) {
            SettingsScreen()
        }

        // Stub screens that correspond to the original activities.
        composable(NavDestination.AssistantHomeInfo.route) {
            SimplePlaceholderScreen(title = "Assistant Home Info")
        }
        composable(NavDestination.Notice.route) {
            SimplePlaceholderScreen(title = "Notice")
        }
    }
}
