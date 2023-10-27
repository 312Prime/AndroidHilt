package com.example.kotlinhilt.ui.activity

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.TextUnit
import com.example.kotlinhilt.ui.theme.KotlinHiltTheme
import com.example.kotlinhilt.ui.viewmodel.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    // Activity나 Fragment에서는 의존성 주입 받을때 Android KTX의 기능을 통해 주입
    private val viewModel: MainViewModel by viewModels<MainViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KotlinHiltTheme {
                // A surface container using the 'background' color from the theme
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {
                    GetRepoToActivity()
                    Button(onClick = { moveToSubActivity() }) {
                        Text(text = "Go to SubActivity!")
                    }
                }
            }
        }
    }

    @Composable
    private fun GetRepoToActivity() {
        Text(
            text = viewModel.getMainName(),
            fontSize = TextUnit.Unspecified,
            modifier = Modifier)
    }

    private fun moveToSubActivity() {
        applicationContext.startActivity(
            Intent(
                applicationContext,
                SubActivity::class.java
            ).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        )
    }
}