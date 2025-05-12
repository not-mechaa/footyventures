package com.wezere.footyventures.ui.theme.screens.Gamedrop

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wezere.footyventures.data.PlayerStats
import com.wezere.footyventures.data.samplePlayer

@Composable
fun StatsCard(title: String, value: String) {
    Card(modifier = Modifier.fillMaxWidth()) {
        Column(
            modifier = Modifier.padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = title, style = MaterialTheme.typography.titleMedium)
            Text(text = value, style = MaterialTheme.typography.bodyLarge)
        }
    }
}
@Composable
fun ProgressStats(player: PlayerStats) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        item {
            Text(text = player.name, style = MaterialTheme.typography.headlineMedium, modifier = Modifier
                .background(color = Color.White))
            Spacer(modifier = Modifier
                .height(16.dp))
        }
        item {
            StatsCard(title = "Goals", value = player.goals.toString())
            Spacer(modifier = Modifier.height(8.dp))
            StatsCard(title = "Matches Played", value = player.matches.toString())
            Spacer(modifier = Modifier.height(5.dp))
            StatsCard(title = "Height", value = "${String.format("%.2f", player.height)} m")
            Spacer(modifier = Modifier.height(8.dp))
            StatsCard(title = "Weight", value = "${String.format("%.1f", player.weight)} kg")
        }
    }
}

@Preview
@Composable
fun Progress_Stats() {
    ProgressStats(player = samplePlayer)
}
