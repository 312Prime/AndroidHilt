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
class SubActivity : ComponentActivity() {

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
                    GetRepoToSubActivity()
                    Button(onClick = { moveToMainActivity() }) {
                        Text(text = "Go to MainActivity")
                    }
                }
            }
        }
    }

    @Composable
    private fun GetRepoToSubActivity() {
        Text(
            text = viewModel.getSubName(),
            fontSize = TextUnit.Unspecified,
            modifier = Modifier
        )
    }

    private fun moveToMainActivity() {
        applicationContext.startActivity(
            Intent(
                applicationContext,
                MainActivity::class.java
            ).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        )
    }

}