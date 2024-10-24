package com.akashi.notesapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import androidx.compose.foundation.layout.Column

import com.akashi.notesapp.presentation.screens.ScaffoldExample
import com.akashi.notesapp.ui.theme.NotesAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ScaffoldExample()
            NotesAppTheme {
                Column(modifier = Modifier
                    .fillMaxSize()) {

                }
            }
        }
    }
}