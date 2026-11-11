package com.crafted.myapp.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.crafted.myapp.R

data class QuickCommand(val name: String, val description: String)

@Composable
fun QuickCommandsScreen() {
    // Placeholder commands – in a real implementation you would query the Bixby capsule DB.
    val commands = remember {
        listOf(
            QuickCommand("Play Music", "Play your favorite music"),
            QuickCommand("Turn On Lights", "Turn on the lights in your home"),
            QuickCommand("Set Alarm", "Set an alarm for tomorrow morning")
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
            items(commands) { command ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = { /* TODO: execute command */ }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = command.name,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = command.description,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}
