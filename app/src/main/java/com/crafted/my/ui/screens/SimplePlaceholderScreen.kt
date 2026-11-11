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
            SmallTopAppBar(
                title = { Text(title) }
            )
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Placeholder for $title",
                style = MaterialTheme.typography.bodyLarge
            )
        }
    }
}
