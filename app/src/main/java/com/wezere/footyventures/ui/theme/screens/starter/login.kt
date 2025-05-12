package com.wezere.footyventures.ui.theme.screens.starter

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wezere.footyventures.navigation.ROUTE_BOTNAV
import com.wezere.footyventures.navigation.ROUTE_PLAYER

@Composable
fun Login_screen(navController: NavHostController) {
    var fname by remember { mutableStateOf(TextFieldValue("")) }
    var lname by remember { mutableStateOf(TextFieldValue("")) }
    var email by remember { mutableStateOf(TextFieldValue("")) }
    var password by remember { mutableStateOf(TextFieldValue("")) }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White),
    ) {
        Spacer(modifier = Modifier.height(47.dp))
        Text(
            "Footy Ventures",
            fontSize = 54.sp,
            color = Color.Black,
            fontFamily = FontFamily.Cursive
        )

        Spacer(modifier = Modifier.height(50.dp))
        OutlinedTextField(
            value = fname,
            onValueChange = { fname = it },
            label = { Text(text = "Enter first name",
                fontSize = 24.sp,) },
            leadingIcon = {Icon(Icons.Default.Person, contentDescription ="Person") },
            shape = RoundedCornerShape(15.dp),



            )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = lname,
            onValueChange = { lname = it },
            label = { Text(text = "Enter last name", fontSize = 22.sp) },
            leadingIcon = {Icon(Icons.Default.Person, contentDescription ="Person") },
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.padding(16.dp)

        )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Enter email",
                fontSize = 24.sp,) },
            leadingIcon = { Icon(Icons.Default.Email, contentDescription ="email")},
            shape = RoundedCornerShape(15.dp),



            )
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Enter Password", fontSize = 22.sp) },
            leadingIcon = {Icon(Icons.Default.Lock, contentDescription ="Pass")},
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.padding(16.dp)

        )
        Spacer(modifier = Modifier.height(24.dp))
        Button(onClick = {navController.navigate(ROUTE_BOTNAV)},
            modifier = Modifier.width(300.dp),
            colors =ButtonDefaults.buttonColors(
                containerColor = Color.Blue)){
            Text("Login",
                fontSize = 41.sp,
                fontFamily = FontFamily.Cursive
            )

        }
        Spacer(modifier =Modifier.height(20.dp))
        Text(text = "Don't have an account! just chill",
            fontSize = 15.sp,
            fontFamily = FontFamily.SansSerif,
            modifier = Modifier.clickable {}
        )



    }
}
@Preview(showBackground = true)
@Composable
private fun Login_page() {
    Login_screen(rememberNavController())

}