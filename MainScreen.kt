package me.jose.alejandro.tellez.contador.ui.theme

import android.icu.text.CaseMap
import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarColors
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.jose.alejandro.tellez.contador.R


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview
fun MainScreen (){
    //Estado, asi se mantiene en valor de una variable
    //var contador = 0
    var contador by remember { mutableStateOf((0..5).random()) }
    val dado = listOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)
    Scaffold { innerPadding ->
        TopAppBar(title = {Text("Lanzar dado App")}, colors = TopAppBarDefaults.topAppBarColors(
            MaterialTheme.colorScheme.primaryContainer))
        Column(modifier = Modifier.padding(innerPadding). fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
            Image(painter = painterResource(dado[contador]), contentDescription = null)
            Log.d("mi-app","Estoy haciendo click")
            Button(onClick = {

                contador = (0..5).random()
            }) {
                Text("Lanza el dado!!")
            }
        }
    }


}