package com.crafted.my

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.crafted.my.navigation.AppNavGraph
import com.crafted.my.navigation.NavDestination
import com.crafted.my.ui.theme.MyAppTheme
import com.crafted.my.ui.components.BottomNavBar
import com.crafted.my.ui.components.TopAppBarWithLogo

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyAppTheme {
                val navController = rememberNavController()
                var currentDest by remember { mutableStateOf<NavDestination>(NavDestination.Home) }

                // Track current destination for UI highlight
                LaunchedEffect(navController) {
                    navController.currentBackStackEntryFlow.collect { entry ->
                        currentDest = when (entry.destination.route) {
                            NavDestination.Home.route -> NavDestination.Home
                            NavDestination.QuickCommands.route -> NavDestination.QuickCommands
                            NavDestination.MyCapsules.route -> NavDestination.MyCapsules
                            NavDestination.Settings.route -> NavDestination.Settings
                            else -> NavDestination.Home
                        }
                    }
                }

                Scaffold(
                    topBar = { TopAppBarWithLogo() },
                    bottomBar = {
                        BottomNavBar(
                            currentDestination = currentDest,
                            onNavigate = { dest ->
                                navController.navigate(dest.route) {
                                    // Avoid building up a huge back stack
                                    launchSingleTop = true
                                    restoreState = true
                                    popUpTo(navController.graph.startDestinationId) {
                                        saveState = true
                                    }
                                }
                            }
                        )
                    }
                ) { innerPadding ->
                    AppNavGraph(
                        navController = navController,
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding)
                    )
                }
            }
        }
    }
}