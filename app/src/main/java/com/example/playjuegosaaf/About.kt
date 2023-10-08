package com.example.playjuegosaaf

import android.content.res.Configuration
import android.widget.Toast
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
    val configuration = LocalConfiguration.current
    when (configuration.orientation) {
        Configuration.ORIENTATION_LANDSCAPE -> {
            LazyColumn(
            ) {
                items(getAboutData()) { about ->
                    ItemAbout(aboutData = about)

                }
            }
        }

        else -> {
            LazyColumn(
            ) {
                items(getAboutData()) { about ->
                    ItemAbout(aboutData = about)

                }
            }
        }
    }
}

data class AboutData(
    var namesAbout: String,
    var pointsAbout: String,
    @DrawableRes var photo: Int
)

fun getAboutData(): List<AboutData> {
    return listOf(
        AboutData(
            "Maria Mata",
            "Points: 2014",
            R.drawable.image1,
        ),
        AboutData(
            "Leo Pessi",
            "Points: 2056",
            R.drawable.image2,
        ),
        AboutData(
            "Carlos Sainz",
            "Points: 5463",
            R.drawable.image3,
        ),
        AboutData(
            "Bea Lafea",
            "Points: 1234",
            R.drawable.image4,
        ),
        AboutData(
            "Cris Tiano",
            "Points: 9999",
            R.drawable.image5,
        ),
        AboutData(
            "Borja Mon",
            "Points: 2131",
            R.drawable.image6,
        ),
        AboutData(
            "Anto Nela",
            "Points: 1342",
            R.drawable.image7,
        ),
        AboutData(
            "Geor Giana",
            "Points: 9888",
            R.drawable.image8,
        ),
    )
}

@Composable
fun ItemAbout(aboutData: AboutData) {
    val peso = 1f
    val context = LocalContext.current
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
            .clickable {
                Toast
                    .makeText(
                        context,
                        aboutData.namesAbout,
                        Toast.LENGTH_LONG
                    )
                    .show()
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {
        Row(
            modifier = Modifier
                .weight(peso)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = aboutData.photo),
                contentDescription = "Game Image",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(4.dp)
            )
        }
        Column(
            modifier = Modifier
                .weight(peso)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = aboutData.namesAbout)
            Text(text = aboutData.pointsAbout)
        }
    }
}
