package com.crafted.my.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.crafted.my.R

data class QuickCommand(val phrase: String, val description: String)

@Composable
fun QuickCommandsScreen() {
    // Dummy data – replace with real model if you integrate the original logic.
    val commands = remember {
        listOf(
            QuickCommand("Hey my", "Launch the app with a voice command"),
            QuickCommand("Open Settings", "Navigate to settings"),
            QuickCommand("Show Weather", "Display weather forecast")
        )
    }

    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text(stringResource(id = R.string.title_quick_commands)) }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(commands) { cmd ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = { /* TODO: invoke quick command */ }
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(text = cmd.phrase, style = MaterialTheme.typography.titleMedium)
                        Text(text = cmd.description, style = MaterialTheme.typography.bodyMedium)
                    }
                }
            }
        }
    }
}