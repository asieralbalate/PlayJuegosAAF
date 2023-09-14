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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPlayer(){
    var pesoH = 1f
    var pesoV = 2f
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {

                }
                Spacer(modifier = Modifier.size(50.dp))
                Spacer(modifier = Modifier.size(50.dp))
                Spacer(modifier = Modifier.size(50.dp))
                Row {

                }
                Row {

                }
            }
        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {
                    Image(painter = painterResource(id = R.drawable.account), contentDescription = "AccountImage",
                        Modifier.weight(pesoH))
                    TextField(value = "Account", onValueChange = {}, Modifier.weight(pesoV))
                }
                Spacer(modifier = Modifier.size(50.dp))
                Spacer(modifier = Modifier.size(50.dp))
                Spacer(modifier = Modifier.size(50.dp))
                Row {

                }
                Row {

                }
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Row {

                }
                Spacer(modifier = Modifier.size(50.dp))
                Row {

                }
                Spacer(modifier = Modifier.size(50.dp))
                Row {

                }
                Spacer(modifier = Modifier.size(50.dp))
                Row {

                }
                Spacer(modifier = Modifier.size(50.dp))
                Row {

                }
                Row {

                }
            }
        }
    }
}