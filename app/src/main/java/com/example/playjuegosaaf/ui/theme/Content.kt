package com.example.playjuegosaaf.ui.theme

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.playjuegosaaf.R

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = stringResource(id = R.string.title),
        fontSize = 50.sp
    )
    Spacer(modifier = Modifier.size(50.dp))
    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
        Text(text = stringResource(id = R.string.play))

    }
    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
        Text(text = stringResource(id = R.string.new_player))
    }
    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
        Text(text = stringResource(id = R.string.preferences))
    }
    Button(onClick = { /*TODO*/ }, modifier = Modifier.width(200.dp)) {
        Text(text = stringResource(id = R.string.about))
    }
}
