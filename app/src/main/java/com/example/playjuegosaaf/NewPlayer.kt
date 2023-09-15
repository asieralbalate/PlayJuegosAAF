package com.example.playjuegosaaf

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPlayer() {
    var pesoH1 = 2f
    var pesoH2 = 3f
    var pesoV1 = 1f
    var pesoV2 = 2f
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .width(IntrinsicSize.Max)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.account),
                        contentDescription = "AccountImage",
                        Modifier
                            .weight(pesoH1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Nombre",
                        onValueChange = {},
                        Modifier
                            .weight(pesoH2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Spacer(modifier = Modifier.weight(pesoH1))
                    TextField(
                        value = "Apellidos",
                        onValueChange = {},
                        Modifier
                            .weight(pesoH2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Spacer(modifier = Modifier.weight(pesoH1))
                    TextField(
                        value = "Nickname",
                        onValueChange = {},
                        Modifier
                            .weight(pesoH2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.account),
                        contentDescription = "AccountImage",
                        Modifier
                            .weight(pesoH1)
                            .wrapContentSize()
                    )
                    Button(onClick = { /*TODO*/ }) {

                    }
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .width(IntrinsicSize.Max)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.camera),
                        contentDescription = "CameraImage",
                        Modifier
                            .weight(pesoH1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Telefono",
                        onValueChange = {},
                        Modifier
                            .weight(pesoH2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .width(IntrinsicSize.Max)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "EmailImage",
                        Modifier
                            .weight(pesoH1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Email",
                        onValueChange = {},
                        Modifier
                            .weight(pesoH2)
                            .padding(end = 10.dp)
                    )
                }
            }
        }

        else -> {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .width(IntrinsicSize.Max)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.account),
                        contentDescription = "AccountImage",
                        Modifier
                            .weight(pesoV1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Nombre",
                        onValueChange = {},
                        Modifier
                            .weight(pesoV2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Spacer(modifier = Modifier.weight(pesoV1))
                    TextField(
                        value = "Apellidos",
                        onValueChange = {},
                        Modifier
                            .weight(pesoV2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Spacer(modifier = Modifier.weight(pesoV1))
                    TextField(
                        value = "Nickname",
                        onValueChange = {},
                        Modifier
                            .weight(pesoV2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.account),
                        contentDescription = "AccountImage",
                        Modifier
                            .weight(pesoV1)
                            .wrapContentSize()
                    )
                    Button(onClick = { /*TODO*/ }) {

                    }
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .width(IntrinsicSize.Max)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.camera),
                        contentDescription = "CameraImage",
                        Modifier
                            .weight(pesoV1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Telefono",
                        onValueChange = {},
                        Modifier
                            .weight(pesoV2)
                            .padding(end = 10.dp)
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .width(IntrinsicSize.Max)
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = "EmailImage",
                        Modifier
                            .weight(pesoV1)
                            .fillMaxSize()
                    )
                    TextField(
                        value = "Email",
                        onValueChange = {},
                        Modifier
                            .weight(pesoV2)
                            .padding(end = 10.dp)
                    )
                }
            }

        }
    }
}