package com.example.playjuegosaaf

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.playjuegosaaf.ui.theme.FontTittle
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun Portada(navController: NavHostController) {
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.titleicon),
                    contentDescription = "AccountImage",
                    Modifier
                        .size(70.dp)
                )
                Spacer(modifier = Modifier.size(30.dp))
                Text(
                    text = stringResource(id = R.string.title),
                    fontSize = 50.sp,
                    color = Color.White,
                    fontFamily = FontTittle
                )
                Spacer(modifier = Modifier.size(30.dp))
                Row {
                    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
                        Text(text = stringResource(id = R.string.play))
                    }
                    Spacer(modifier = Modifier.width(25.dp))
                    Button(onClick = {
                        navController.navigate("NewPlayer")
                    }, modifier = Modifier.width(200.dp)) {
                        Text(text = stringResource(id = R.string.new_player))
                    }
                }
                Row {
                    Button(onClick = { navController.navigate("Preferences")}, modifier = Modifier.width(200.dp)) {
                        Text(text = stringResource(id = R.string.preferences))
                    }
                    Spacer(modifier = Modifier.width(25.dp))
                    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
                        Text(text = stringResource(id = R.string.about))
                    }
                }
            }
        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.titleicon),
                    contentDescription = "AccountImage",
                    Modifier
                        .size(130.dp)

                )
                Spacer(modifier = Modifier.size(50.dp))
                Text(
                    text = stringResource(id = R.string.title),
                    color = Color.White,
                    fontSize = 50.sp,
                    fontFamily = FontTittle
                )
                Spacer(modifier = Modifier.size(50.dp))
                Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
                    Text(text = stringResource(id = R.string.play))

                }
                Button(onClick = {
                    navController.navigate("NewPlayer")
                }, modifier = Modifier.width(200.dp)) {
                    Text(text = stringResource(id = R.string.new_player))
                }
                Button(onClick = { navController.navigate("Preferences") }, modifier = Modifier.width(200.dp)) {
                    Text(text = stringResource(id = R.string.preferences))
                }
                Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
                    Text(text = stringResource(id = R.string.about))
                }
            }
        }
    }
}
