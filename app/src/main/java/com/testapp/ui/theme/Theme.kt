package com.testapp.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun TestAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(content = content)
}