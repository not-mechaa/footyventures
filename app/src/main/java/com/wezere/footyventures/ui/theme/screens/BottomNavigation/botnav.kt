package com.wezere.footyventures.ui.theme.screens.BottomNavigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wezere.footyventures.navigation.ROUTE_PLAYER
import com.wezere.footyventures.navigation.ROUTE_PROGRESS
import com.wezere.footyventures.navigation.ROUTE_TRAINING

@Composable
fun Botnav(navController: NavHostController) {
    Column {
        Text("Botnav - Choose where to go:")

        Button(onClick = { navController.navigate(ROUTE_PLAYER) }) {
            Text("Go to Player_profile")
        }
        Button(onClick = { navController.navigate(ROUTE_PROGRESS) }) {
            Text("Go to Screen B")
        }
        Button(onClick = { navController.navigate(ROUTE_TRAINING) }) {
            Text("Go to Screen C")
        }
    }
}

@Composable
 fun Player_profile() {Text("Welcome to Player profile") }

@Composable
fun () { Text("Welcome to Screen B") }

@Composable
fun TrainingScreen() { Text("Welcome to Screen C") }


@Preview(showBackground = true)
@Composable
fun Botnav_page(){
    Botnav(rememberNavController())

}