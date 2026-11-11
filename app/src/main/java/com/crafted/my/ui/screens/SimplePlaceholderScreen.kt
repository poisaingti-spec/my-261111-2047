package com.crafted.my.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun SimplePlaceholderScreen(title: String) {
    Scaffold(
        topBar = {
            SmallTopAppBar(title = { Text(title) })
        }
    ) { innerPadding ->
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            Text(text = "Placeholder for $title screen", style = MaterialTheme.typography.bodyLarge)
        }
    }
}