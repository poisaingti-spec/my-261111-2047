package com.crafted.my.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.clickable
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.crafted.my.R
import com.crafted.my.navigation.NavDestination

@Composable
fun HomeScreen(onNavigate: (NavDestination) -> Unit) {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.assistant_home),
                style = MaterialTheme.typography.headlineMedium
            )
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { onNavigate(NavDestination.AssistantHomeInfo) },
                shape = MaterialTheme.shapes.medium,
                colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surfaceContainer)
            ) {
                Row(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_dialog_info),
                        contentDescription = null,
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(48.dp)
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    Column {
                        Text(
                            text = stringResource(id = R.string.assi_home_generic_error),
                            style = MaterialTheme.typography.bodyLarge
                        )
                        Text(
                            text = stringResource(id = R.string.assi_home_no_network_connection),
                            style = MaterialTheme.typography.bodyMedium,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }

            Divider()
            Text(
                text = stringResource(id = R.string.title_quick_commands),
                style = MaterialTheme.typography.titleMedium
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                IconButton(onClick = { onNavigate(NavDestination.QuickCommands) }) {
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_media_play),
                        contentDescription = "Quick Commands"
                    )
                }
                IconButton(onClick = { onNavigate(NavDestination.MyCapsules) }) {
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_menu_agenda),
                        contentDescription = "My Capsules"
                    )
                }
                IconButton(onClick = { onNavigate(NavDestination.Settings) }) {
                    Icon(
                        painter = painterResource(id = android.R.drawable.ic_menu_manage),
                        contentDescription = "Settings"
                    )
                }
            }
        }
    }
}
