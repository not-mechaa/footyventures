package com.wezere.footyventures.ui.theme.screens.Deckstart.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.wezere.footyventures.R
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wezere.footyventures.navigation.ROUTE_LOGIN

@Composable
fun Home_screen(navController: NavHostController) {

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top){
        Spacer(modifier = Modifier.height(50.dp))
        Text("Footy App",
            color = Color.White,

            fontSize = 70.sp,
            fontFamily = FontFamily.Cursive
        )
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(id= R.drawable.footy),
            contentDescription="Car Image", modifier = Modifier
                .fillMaxWidth()
                .height(200.dp))


        Spacer(modifier = Modifier.height(50.dp))
        Button(onClick = {navController.navigate(ROUTE_LOGIN)},
            modifier=Modifier.width(200.dp)) {
            Text(
                "Login",
                fontSize = 44.sp,
                fontFamily = FontFamily.Cursive,
            )

        }

            }
        }



@Preview
@Composable
private fun Home_screen_page() {
    Home_screen(rememberNavController())}

