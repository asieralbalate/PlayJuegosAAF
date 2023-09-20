package com.example.playjuegosaaf

import android.content.res.Configuration

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playjuegosaaf.ui.theme.DarkTeal
import com.example.playjuegosaaf.ui.theme.LighterTeal
import com.example.playjuegosaaf.ui.theme.SecondaryYellow

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewPlayer() {
    var name by remember { mutableStateOf("") }
    var surname by remember { mutableStateOf("") }
    var nickname by remember { mutableStateOf("") }
    var phoneNumber by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var errorTextName by rememberSaveable { mutableStateOf("*Obligatorio") }
    var errorTextNickame by rememberSaveable { mutableStateOf("*Obligatorio") }
    var peso1 = 1f
    var peso2 = 2f
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
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
                        value = name,
                        onValueChange = { name = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Name") },
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )
                    )
                }
                Row(Modifier.height(20.dp)) {
                    Spacer(modifier = Modifier.weight(peso1))
                    Text(
                        text = errorTextName,
                        modifier = Modifier
                            .weight(peso2)
                            .padding(start = 15.dp),
                        if (errorTextName.equals("Error: Campo necesario")) {
                            Color.Red
                        } else {
                            Color.Black
                        },
                        fontSize = 12.sp
                    )
                }
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()
                ) {
                    Spacer(modifier = Modifier.weight(peso1))
                    TextField(
                        value = surname,
                        onValueChange = { surname = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Surname") },
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )

                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row {
                    Spacer(modifier = Modifier.weight(peso1))
                    TextField(
                        value = nickname,
                        onValueChange = { nickname = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname") },
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )
                    )
                }
                Row(Modifier.height(20.dp)) {
                    Spacer(modifier = Modifier.weight(peso1))
                    Text(
                        text = errorTextNickame,
                        modifier = Modifier
                            .weight(peso2)
                            .padding(start = 15.dp),
                        if (errorTextNickame.equals("Error: Campo necesario")) {
                            Color.Red
                        } else {
                            Color.Black
                        },
                        fontSize = 12.sp
                    )
                }
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
                        colors = ButtonDefaults.buttonColors(
                            containerColor = SecondaryYellow,
                            contentColor = Color.Black
                        ),
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
                        value = "Phone Number",
                        onValueChange = { phoneNumber = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )

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
                        value = email,
                        onValueChange = { email = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Email") },
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (name.isEmpty() && nickname.isEmpty()) {
                                errorTextName = "Error: Campo necesario"
                                errorTextNickame = "Error: Campo necesario"
                            } else if (name.isEmpty() && !nickname.isEmpty()) {
                                errorTextName = "Error: Campo necesario"
                                errorTextNickame = "Listo"
                            } else if (nickname.isEmpty() && !name.isEmpty()) {
                                errorTextName = "Listo"
                                errorTextNickame = "Error: Campo necesario"
                            } else {
                                errorTextName = "Listo"
                                errorTextNickame = "Listo"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = DarkTeal,
                            contentColor = Color.White
                        )

                    ) {
                        Text(text = "Add new player")
                    }
                }
                Spacer(modifier = Modifier.size(15.dp))
            }
        }


        else -> {
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
                        value = name,
                        onValueChange = { name = it },
                        modifier = Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Name") },
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )
                    )
                }
                Row(Modifier.height(20.dp)) {
                    Spacer(modifier = Modifier.weight(peso1))
                    Text(
                        text = errorTextName,
                        modifier = Modifier
                            .weight(peso2)
                            .padding(start = 15.dp),
                        if (errorTextName.equals("Error: Campo necesario")) {
                            Color.Red
                        } else {
                            Color.Black
                        },
                        fontSize = 12.sp
                    )
                }
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize()

                ) {
                    Spacer(modifier = Modifier.weight(peso1))
                    TextField(
                        value = surname,
                        onValueChange = { surname = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Surname") },
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )
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
                        value = nickname,
                        onValueChange = { nickname = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Nickname") },
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )
                    )
                }
                Row(Modifier.height(20.dp)) {
                    Spacer(modifier = Modifier.weight(peso1))
                    Text(text = errorTextNickame,
                        modifier = Modifier
                            .weight(peso2)
                            .padding(start = 15.dp),
                        if (errorTextNickame.equals("Error: Campo necesario")) {
                            Color.Red
                        } else {
                            Color.Black
                        },
                        fontSize = 12.sp)
                }
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
                        colors = ButtonDefaults.buttonColors(
                            containerColor = SecondaryYellow,
                            contentColor = Color.Black
                        ),
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
                        value = "Phone Number",
                        onValueChange = { phoneNumber = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )

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
                        value = email,
                        onValueChange = { email = it },
                        Modifier
                            .weight(peso2)
                            .padding(end = 10.dp),
                        label = { Text(text = "Email") },
                        shape = RoundedCornerShape(20.dp, 20.dp, 0.dp, 0.dp),
                        colors = TextFieldDefaults.textFieldColors(
                            containerColor = LighterTeal,
                            focusedIndicatorColor = SecondaryYellow
                        )
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(60.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Button(
                        onClick = {
                            if (name.isEmpty() && nickname.isEmpty()) {
                                errorTextName = "Error: Campo necesario"
                                errorTextNickame = "Error: Campo necesario"
                            } else if (name.isEmpty() && !nickname.isEmpty()) {
                                errorTextName = "Error: Campo necesario"
                                errorTextNickame = "Listo"
                            } else if (nickname.isEmpty() && !name.isEmpty()) {
                                errorTextName = "Listo"
                                errorTextNickame = "Error: Campo necesario"
                            } else {
                                errorTextName = "Listo"
                                errorTextNickame = "Listo"
                            }
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = DarkTeal,
                            contentColor = Color.White
                        )

                    ) {
                        Text(text = "Add new player")
                    }
                }
                Spacer(modifier = Modifier.size(15.dp))
            }
        }
    }
}