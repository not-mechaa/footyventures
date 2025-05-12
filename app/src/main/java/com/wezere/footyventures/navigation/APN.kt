package com.wezere.footyventures.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.wezere.footyventures.data.samplePlayer
import com.wezere.footyventures.ui.theme.screens.BottomNavigation.Botnav
import com.wezere.footyventures.ui.theme.screens.Deckstart.Home_screen
import com.wezere.footyventures.ui.theme.screens.Gamedrop.Player_profile
import com.wezere.footyventures.ui.theme.screens.Gamedrop.ProgressStats
import com.wezere.footyventures.ui.theme.screens.Gamedrop.TrainingScreen
import com.wezere.footyventures.ui.theme.screens.starter.Login_screen



@Composable
fun APN(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController()
               ,startDestination:String= ROUTE_HOME) {
    NavHost(
        navController = navController, modifier = modifier,
        startDestination = startDestination
    ) {
        composable(ROUTE_HOME) {
            Home_screen(navController)

        }
        composable(ROUTE_LOGIN) {
            Login_screen(navController)
        }

        composable(ROUTE_BOTNAV) {
            Botnav(navController)
        } // Acts as a hub

        composable(ROUTE_PLAYER){
            Player_profile(navController)
        }
        composable (ROUTE_PROGRESS){
            ProgressStats(player = samplePlayer)
        }
        composable (ROUTE_TRAINING) {
            TrainingScreen(navController)
        }
    }
}