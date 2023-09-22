package com.example.playjuegosaaf

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.Slider

import androidx.compose.material3.SliderDefaults

import androidx.compose.material3.Surface
import androidx.compose.material3.Text

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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp

import com.example.playjuegosaaf.ui.theme.LightTeal
import com.example.playjuegosaaf.ui.theme.LighterTeal

import com.example.playjuegosaaf.ui.theme.SecondaryYellowDarker
import com.example.playjuegosaaf.ui.theme.Teal


@Composable
fun Preferences() {
    var selection by remember { mutableStateOf(5f) }
    val range = 0f..10f
    val configuration = LocalConfiguration.current
    var context = LocalContext.current
    var estadoRadio by rememberSaveable { mutableStateOf(" ") }
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(20.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Elige una opción:"
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Surface(
                    modifier = Modifier.padding(start = 10.dp)
                ) {
                    var estadoRadio by rememberSaveable { mutableStateOf(" ") }
                    MyRadioButton(estadoRadio) { estadoRadio = it }
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(Modifier.height(20.dp)) {
                    Slider(
                        value = selection,
                        valueRange = range,
                        onValueChange = { selection = it },
                        steps = 10
                    )

                }
            }
        }

        else -> {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .verticalScroll(rememberScrollState()),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start
            ) {
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(20.dp)
                        .fillMaxSize(),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Elige una opción:"
                    )
                }
                Spacer(modifier = Modifier.size(15.dp))
                Surface(
                    modifier = Modifier.padding(start = 10.dp),
                ) {

                    MyRadioButton(estadoRadio) { estadoRadio = it }
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(20.dp)
                        .padding(start = 10.dp, end = 10.dp)
                ) {
                    Slider(
                        value = selection,
                        valueRange = range,
                        onValueChange = { selection = it },
                        steps = 9,
                        colors = SliderDefaults.colors(
                            thumbColor = Teal, // Color del pulgar
                            activeTrackColor = Teal, // Color de la línea activa (donde se encuentra el pulgar)
                            inactiveTrackColor = LighterTeal, // Color de la línea inactiva
                            activeTickColor = LightTeal, // Color de las marcas en la línea activa
                            inactiveTickColor = Color.Black, // Color de las marcas en la línea inactiva
                        ),
                    )
                }



            }
            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
                FloatingActionButton(
                onClick = {
                    if (estadoRadio.contentEquals(" ")) {
                        Toast.makeText(
                            context,
                            "No has pulsado ninguna opcion",
                            Toast.LENGTH_LONG
                        ).show()
                    } else {

                        Toast.makeText(context, "Has seleccionado $estadoRadio con una puntuacion de $selection", Toast.LENGTH_LONG).show()
                    }

                },
                shape = CircleShape,
                containerColor = SecondaryYellowDarker,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 10.dp).height(50.dp).width(50.dp)
            ) {
                    Image(
                        painter = painterResource(id = R.drawable.tick),
                        contentDescription = "Tick",


                    )
            }}


        }
    }
}

@Composable
fun MyRadioButton(name: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxSize()) {
        Row {
            RadioButton(selected = name == "Angry Birds", onClick = {
                onItemSelected("Angry Birds")
            }, colors = RadioButtonDefaults.colors(selectedColor = SecondaryYellowDarker))
            Text(text = "Angry Birds", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "Dragon Fly", onClick = {
                onItemSelected("Dragon Fly")
            }, colors = RadioButtonDefaults.colors(selectedColor = SecondaryYellowDarker))
            Text(text = "Dragon Fly", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "Hill Climb Racing", onClick = {
                onItemSelected("Hill Climb Racing")
            }, colors = RadioButtonDefaults.colors(selectedColor = SecondaryYellowDarker))
            Text(text = "Hill Climb Racing", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "Pocket Soccer", onClick = {
                onItemSelected("Pocket Soccer")
            }, colors = RadioButtonDefaults.colors(selectedColor = SecondaryYellowDarker))
            Text(text = "Pocket Soccer", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "Radiant Defense", onClick = {
                onItemSelected("Radiant Defense")
            }, colors = RadioButtonDefaults.colors(selectedColor = SecondaryYellowDarker))
            Text(text = "Radiant Defense", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "Ninja Jump", onClick = {
                onItemSelected("Ninja Jump")
            }, colors = RadioButtonDefaults.colors(selectedColor = SecondaryYellowDarker))
            Text(text = "Ninja Jump", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "Air Control", onClick = {
                onItemSelected("Air Control")
            }, colors = RadioButtonDefaults.colors(selectedColor = SecondaryYellowDarker))
            Text(text = "Air Control", Modifier.padding(top = 12.dp))
        }
    }
}
