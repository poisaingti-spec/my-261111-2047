package com.crafted.my.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.crafted.my.R

data class Capsule(val name: String, val description: String)

@Composable
fun MyCapsulesScreen() {
    val capsules = remember {
        listOf(
            Capsule("Music", "Play music and control playback"),
            Capsule("SmartThings", "Control smart home devices"),
            Capsule("Calendar", "Manage events and reminders")
        )
    }

    Scaffold(
        topBar = {
            SmallTopAppBar(
                title = { Text(stringResource(id = R.string.title_my_capsules)) }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            contentPadding = innerPadding,
            verticalArrangement = Arrangement.spacedBy(8.dp),
            modifier = Modifier.fillMaxSize()
        ) {
            items(capsules) { capsule ->
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 16.dp),
                    onClick = { /* TODO: open capsule detail */ }
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp)
                    ) {
                        Text(
                            text = capsule.name,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = capsule.description,
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                }
            }
        }
    }
}
