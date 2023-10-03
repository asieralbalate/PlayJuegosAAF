package com.example.playjuegosaaf

import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun About() {
    val peso = 1f
    val imageResIdsAbout = listOf(
        R.drawable.games_angrybirds,
        R.drawable.games_dragonfly,
        R.drawable.games_hillclimbingracing,
        R.drawable.games_radiantdefense,
        R.drawable.games_pocketsoccer
    )

    val namesAbout = listOf(
        "Maria Mata\nPoints: 2014",
        "Leo Pessi\nPoints: 2056",
        "Carlos Sainz\nPoints: 5463",
        "Bea Lafea\nPoints: 1234",
        "Cris Tiano\nPoints: 9999"
    )

    val context = LocalContext.current
    val configuration = LocalConfiguration.current

    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            LazyColumn(
            ) {
                items(imageResIdsAbout.size) { index ->
                    val imageResIdAb = imageResIdsAbout[index]
                    val nameAb = namesAbout[index]

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                            .clickable { Toast.makeText(
                                context,
                                nameAb,
                                Toast.LENGTH_LONG
                            ).show()}
                        ,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Row (modifier = Modifier
                            .weight(peso)
                            .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center){
                            Image(
                                painter = painterResource(id = imageResIdAb),
                                contentDescription = "Game Image",
                                modifier = Modifier.size(170.dp)
                            )
                        }

                        Row (modifier = Modifier
                            .weight(peso)
                            .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center) {

                            Text(text = nameAb)
                        }
                    }
                }
            }
        }
        else -> {
            LazyColumn(
            ) {
                items(imageResIdsAbout.size) { index ->
                    val imageResIdAb = imageResIdsAbout[index]
                    val nameAb = namesAbout[index]

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(12.dp)
                            .clickable { Toast.makeText(
                                context,
                                nameAb,
                                Toast.LENGTH_LONG
                            ).show()}
                        ,
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Row (modifier = Modifier
                            .weight(peso)
                            .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center){
                            Image(
                                painter = painterResource(id = imageResIdAb),
                                contentDescription = "Game Image",
                                modifier = Modifier.size(170.dp)
                            )
                        }

                        Row (modifier = Modifier
                            .weight(peso)
                            .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.Center) {

                            Text(text = nameAb)
                        }
                    }
                }
            }
        }
    }
}



