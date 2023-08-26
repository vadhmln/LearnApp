package ru.vdh.learnapp.card.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun CardContent(
    frontText: String,
    onFrontTextChanged: (String) -> Unit,
    backText: String,
    onBackTextChanged: (String) -> Unit,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(12.dp)
    ) {
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = frontText,
            onValueChange = { onFrontTextChanged(it) },
            label = { Text(text = "Вопрос") },
            textStyle = MaterialTheme.typography.bodyLarge
        )
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = backText,
            onValueChange = { onBackTextChanged(it) },
            label = { Text(text = "Ответ") },
            textStyle = MaterialTheme.typography.bodyLarge
        )
    }
}