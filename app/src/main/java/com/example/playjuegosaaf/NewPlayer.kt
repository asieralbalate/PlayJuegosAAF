package com.example.playjuegosaaf

import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPlayer() {
    var peso1 = 1f
    var peso2 = 2f
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.account),
                            contentDescription = "AccountImage",
                            Modifier
                                .weight(peso1)
                                .fillMaxSize()
                        )
                        TextField(
                            value = "Nombre",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Spacer(modifier = Modifier.weight(peso1))
                        TextField(
                            value = "Apellidos",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row {
                        Spacer(modifier = Modifier.weight(peso1))
                        TextField(
                            value = "Nickname",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.weight(peso1))
                        Image(
                            painter = painterResource(id = R.drawable.android),
                            contentDescription = "Android Icon",
                            Modifier
                                .weight(peso1)
                                .fillMaxSize(),
                        )
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .weight(peso1)
                                .padding(end = 35.dp)
                        ) {
                            Text(text = "Change")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = "CameraImage",
                            Modifier
                                .weight(peso1)
                                .fillMaxSize()
                        )
                        TextField(
                            value = "Telefono",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.email),
                            contentDescription = "EmailImage",
                            Modifier
                                .weight(peso1)
                                .fillMaxSize()
                        )
                        TextField(
                            value = "Email",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                }
            }

        }


        else -> {
            Box(modifier = Modifier.fillMaxSize()) {
                Column(
                    modifier = Modifier.fillMaxSize().verticalScroll(rememberScrollState()),
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.Start
                ) {
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxSize()

                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.account),
                            contentDescription = "AccountImage",
                            Modifier
                                .weight(peso1)
                                .fillMaxSize()
                        )
                        TextField(
                            value = "Nombre",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxSize()

                    ) {
                        Spacer(modifier = Modifier.weight(peso1))
                        TextField(
                            value = "Apellidos",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxSize()

                    ) {
                        Spacer(modifier = Modifier.weight(peso1))
                        TextField(
                            value = "Nickname",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxWidth()
                    ) {
                        Spacer(modifier = Modifier.weight(peso1))
                        Image(
                            painter = painterResource(id = R.drawable.android),
                            contentDescription = "Android Icon",
                            Modifier
                                .weight(peso1)
                                .fillMaxSize(),
                        )
                        Button(
                            onClick = { /*TODO*/ },
                            modifier = Modifier
                                .weight(peso1)
                                .padding(end = 35.dp)
                        ) {
                            Text(text = "Change")
                        }
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.camera),
                            contentDescription = "CameraImage",
                            Modifier
                                .weight(peso1)
                                .fillMaxSize()
                        )
                        TextField(
                            value = "Telefono",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                    Row(
                        Modifier
                            .height(60.dp)
                            .fillMaxSize()
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.email),
                            contentDescription = "EmailImage",
                            Modifier
                                .weight(peso1)
                                .fillMaxSize()
                        )
                        TextField(
                            value = "Email",
                            onValueChange = {},
                            Modifier
                                .weight(peso2)
                                .padding(end = 10.dp)
                        )
                    }
                    Spacer(modifier = Modifier.size(15.dp))
                }
            }
        }

    }
}