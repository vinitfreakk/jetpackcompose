package com.example.composeapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.composeapp.ui.theme.ComposeAppTheme

    class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContent {
                // if your using Row then you "verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center" to align the Row compose contains
                Row(Modifier.fillMaxSize(0.5f).background(Color.Green), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){
                    Text("Hello")
                    Text("World")
                    Text("World")
                }

            }
        }
    }

