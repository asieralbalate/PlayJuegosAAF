package com.example.playjuegosaaf

import android.content.res.Configuration
import android.graphics.drawable.Icon
import android.media.Image
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.playjuegosaaf.ui.theme.Teal
import java.util.ArrayList


@Composable
fun Play() {

    val imageResIds = listOf(
        R.drawable.games_angrybirds,
        R.drawable.games_dragonfly,
        R.drawable.games_hillclimbingracing,
        R.drawable.games_radiantdefense,
        R.drawable.games_pocketsoccer,
        R.drawable.games_ninjump,
        R.drawable.games_aircontrol,
    )

    val titles = listOf(
        "Angry Birds",
        "Dragon Fly",
        "Hill Climb Racing",
        "Radiant Defense",
        "Pocket Soccer",
        "Ninja Jump",
        "Air Control",
    )

    val myOptions = getOptions(imageResIds, titles)
    val noSelection = myOptions.none { it.selected }
    var context = LocalContext.current
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
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Row() {
                        Column(modifier = Modifier.fillMaxWidth().padding(start = 10.dp)) {
                            myOptions.forEach {
                                MyCheckBox(it)
                            }
                        }
                    }
                }
            }
            Box(Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd) {
                FloatingActionButton(
                    onClick = {
                        if (noSelection) {
                            Toast.makeText(
                                context,
                                "No has seleccionado ninguna opción",
                                Toast.LENGTH_LONG
                            ).show()
                        } else {
                            val selectedOptions = myOptions.filter { it.selected }
                            val message =
                                "Has seleccionado ${selectedOptions.joinToString { it.title }}"
                            Toast.makeText(
                                context,
                                message,
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    },
                    shape = CircleShape,
                    containerColor = Teal,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 10.dp)
                        .height(50.dp)
                        .width(50.dp)
                )
                {
                    Icon(imageVector = Icons.Filled.Check, contentDescription = "check")
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
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    Row (){

                        Column(modifier = Modifier.fillMaxWidth().padding(start = 10.dp)) {
                            myOptions.forEach {
                                MyCheckBox(it)
                            }
                        }
                    }
                }
            }
            Box (Modifier.fillMaxSize(), contentAlignment = Alignment.BottomEnd){
                FloatingActionButton(
                    onClick = {
                        if (noSelection) {
                            Toast.makeText(
                                context,
                                "No has seleccionado ninguna opción",
                                Toast.LENGTH_LONG
                            ).show()
                        } else {
                            val selectedOptions = myOptions.filter { it.selected }
                            val message = "Has seleccionado ${selectedOptions.joinToString { it.title }}"
                            Toast.makeText(
                                context,
                                message,
                                Toast.LENGTH_LONG
                            ).show()
                        }
                    },
                    shape = CircleShape,
                    containerColor = Teal,
                    modifier = Modifier
                        .padding(horizontal = 10.dp, vertical = 10.dp)
                        .height(50.dp)
                        .width(50.dp))
                {
                    Icon(imageVector = Icons.Filled.Check, contentDescription = "check" )
                }
            }
        }
    }
}

data class CheckInfo(
    var imageResId: Int,
     var title:String,
     var selected:Boolean,
     var onCheckedChange:(Boolean)->Unit)

@Composable
fun getOptions(imageResIds: List<Int>, titles: List<String>): List<CheckInfo> {
    return titles.mapIndexed { index, title ->
        var estadoCheck by rememberSaveable {
            mutableStateOf(false)
        }
        CheckInfo(
            imageResId = imageResIds.getOrElse(index) { R.drawable.games_aircontrol},
            title = title,
            selected = estadoCheck,
            onCheckedChange = { estadoCheck = it }
        )
    }
}
@Composable
fun MyCheckBox(checkInfo: CheckInfo) {
    Row(
        modifier = Modifier.height(80.dp)
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = checkInfo.imageResId),
            contentDescription = "Game Image",
            modifier = Modifier.size(58.dp)
        )
        Spacer(modifier = Modifier.width(8.dp))
        Checkbox(
            checked = checkInfo.selected,
            onCheckedChange = {
                checkInfo.onCheckedChange(it)
            }
        )
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = checkInfo.title)
    }
}