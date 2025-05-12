package com.wezere.footyventures.ui.theme.screens.Gamedrop

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wezere.footyventures.R

@Composable
fun Player_profile(navController: NavHostController) {
        val playerName = "Lenny James"
        val playerPosition = "Winger"
        val age = 18
        val appearances = 54

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Player image (placeholder circle)
            Box(
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .background(Color.Gray),
                contentAlignment = Alignment.Center
            ) {
                Image(painter = painterResource(id= R.drawable.footy),
                    contentDescription="Car Image", modifier = Modifier
                        
                        .clip(CircleShape)
                        .size(120.dp)                    )

//                Text("Photo", color = Color.White)
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Player name and position
            Text(text = playerName, style = MaterialTheme.typography.headlineSmall)
            Text(text = playerPosition, style = MaterialTheme.typography.bodyMedium)

            Spacer(modifier = Modifier.height(24.dp))

            // Player stats
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                StatItem(label = "Age", value = age)
                StatItem(label = "Appearances", value = appearances  )
            }
        }
    }

    @Composable
    fun StatItem(label: String, value: Int) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text = value.toString(), style = MaterialTheme.typography.headlineMedium)
            Text(text = label, style = MaterialTheme.typography.bodySmall)
        }
    }
@Preview(showBackground = true)
@Composable
private fun Player_page() {
    Player_profile(rememberNavController())

}