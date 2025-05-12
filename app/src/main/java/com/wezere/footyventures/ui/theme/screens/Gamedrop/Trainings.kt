package com.wezere.footyventures.ui.theme.screens.Gamedrop

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wezere.footyventures.data.TrainingProgressBar
import com.wezere.footyventures.data.TrainingSummaryCard
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun TrainingScreen(navController: NavHostController) {
    var progress by remember { mutableStateOf(0.0f) }
    val scope = rememberCoroutineScope()

    LaunchedEffect(Unit) {
        scope.launch {
            for (i in 1..100) {
                delay(100)
                progress = i / 100f
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        TrainingProgressBar(progress = progress)
        Spacer(modifier = Modifier.height(16.dp))
        TrainingSummaryCard(
            distance  = 5.2f,
            calories = 450,
            duration = "45 min"
        )
    }
}

@Preview
@Composable
private fun Training_page() {
    TrainingScreen(rememberNavController())
}