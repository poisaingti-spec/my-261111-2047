package com.crafted.my.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.crafted.my.R
import com.crafted.my.navigation.NavDestination

@Composable
fun BottomNavBar(
    currentDestination: NavDestination,
    onNavigate: (NavDestination) -> Unit
) {
    NavigationBar {
        BottomNavItem(
            destination = NavDestination.Home,
            icon = Icons.Filled.Home,
            labelRes = R.string.title_home,
            selected = currentDestination is NavDestination.Home,
            onClick = onNavigate
        )
        BottomNavItem(
            destination = NavDestination.QuickCommands,
            icon = Icons.Filled.FlashOn,
            labelRes = R.string.title_quick_commands,
            selected = currentDestination is NavDestination.QuickCommands,
            onClick = onNavigate
        )
        BottomNavItem(
            destination = NavDestination.MyCapsules,
            icon = Icons.Filled.Collections,
            labelRes = R.string.title_my_capsules,
            selected = currentDestination is NavDestination.MyCapsules,
            onClick = onNavigate
        )
        BottomNavItem(
            destination = NavDestination.Settings,
            icon = Icons.Filled.Settings,
            labelRes = R.string.title_settings,
            selected = currentDestination is NavDestination.Settings,
            onClick = onNavigate
        )
    }
}

@Composable
private fun BottomNavItem(
    destination: NavDestination,
    icon: ImageVector,
    labelRes: Int,
    selected: Boolean,
    onClick: (NavDestination) -> Unit
) {
    NavigationBarItem(
        selected = selected,
        onClick = { onClick(destination) },
        icon = { Icon(icon, contentDescription = null) },
        label = { Text(text = stringResource(id = labelRes)) }
    )
}