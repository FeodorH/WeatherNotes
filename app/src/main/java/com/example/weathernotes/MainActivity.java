package com.example.weathernotes;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.setContent;
import androidx.compose.foundation.layout.*;
import androidx.compose.material3.*;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.dp;
import com.example.weathernotes.ui.theme.WeatherNotesTheme;

public class MainActivity extends ComponentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Используем Compose для UI
        setContent {
            WeatherNotesTheme {
                // Наш первый Compose экран
                Surface(
                        modifier = Modifier.fillMaxSize(),
                        color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Weather Notes App")
                }
            }
        }
    }
}

// Compose функция для отображения приветствия
@Composable
fun Greeting(name: String) {
    Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
    ) {
        Text(
                text = "Welcome to $name!",
                style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
                text = "Built with Jetpack Compose",
                style = MaterialTheme.typography.bodyLarge
        )
    }
}