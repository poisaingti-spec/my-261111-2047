package com.crafted.my.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.crafted.my.R

@Composable
fun SettingsScreen() {
    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text(stringResource(id = R.string.title_settings)) }
            )
        }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                text = "Settings",
                style = MaterialTheme.typography.headlineMedium
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = "This is the settings screen.",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}
