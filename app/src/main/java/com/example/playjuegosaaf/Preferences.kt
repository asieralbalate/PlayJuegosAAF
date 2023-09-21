package com.example.playjuegosaaf

import android.content.res.Configuration

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState

import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Surface
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
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playjuegosaaf.ui.theme.DarkTeal
import com.example.playjuegosaaf.ui.theme.LighterTeal
import com.example.playjuegosaaf.ui.theme.SecondaryYellow
import com.example.playjuegosaaf.ui.theme.Teal

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Preferences() {
    var selection by remember { mutableStateOf(50f) }
    val range = 0f..100f
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
                    .fillMaxSize()
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
                Surface(modifier = Modifier.padding(start = 10.dp),
                ) {
                    var estadoRadio by rememberSaveable { mutableStateOf(" ") }
                    MyRadioButton(estadoRadio) { estadoRadio = it }
                }
                Spacer(modifier = Modifier.size(15.dp))
                Row(
                    Modifier
                        .height(20.dp)
                        .padding(start = 10.dp, end = 10.dp)) {
                    Slider(value = selection,
                        valueRange = range ,
                        onValueChange = { selection = it },
                        steps = 9)
                }
            }
        }
    }
}

@Composable
fun MyRadioButton(name: String, onItemSelected: (String) -> Unit) {
    Column(Modifier.fillMaxSize()) {
        Row{
            RadioButton(selected = name == "angrybirds", onClick = {
                onItemSelected("angrybirds")
            }, colors = RadioButtonDefaults.colors(selectedColor = Teal))
            Text(text = "Angry Birds", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "dragonfly", onClick = {
                onItemSelected("dragonfly")
            })
            Text(text = "Dragon Fly", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "hillclimbracing", onClick = {
                onItemSelected("hillclimbracing")
            })
            Text(text = "Hill Climb Racing", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "pocketsoccer", onClick = {
                onItemSelected("pocketsoccer")
            })
            Text(text = "Pocket Soccer", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "radiantdefense", onClick = {
                onItemSelected("radiantdefense")
            })
            Text(text = "Radiant Defense", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "ninjajump", onClick = {
                onItemSelected("ninjajump")
            })
            Text(text = "Ninja Jump", Modifier.padding(top = 12.dp))
        }
        Row {
            RadioButton(selected = name == "aircontrol", onClick = {
                onItemSelected("aircontrol")
            })
            Text(text = "Air Control", Modifier.padding(top = 12.dp))
        }
    }
}
