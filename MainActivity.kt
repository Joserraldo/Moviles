package me.JOSETELLEZ

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import me.JOSETELLEZ.ui.theme.TallerAndroidTheme
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun ventana (){
    Column(modifier = Modifier.fillMaxSize().padding(18.dp), verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally){
        val painter = painterResource(id=R.drawable.ciclista)
        Image(painter=painter, contentDescription = "ciclista", modifier = Modifier.clip(CircleShape).size(120.dp),contentScale = ContentScale.Crop)
        Text(text= "Juan Pérez",fontSize = 30.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(top = 24.dp, bottom = 8.dp))
        Text(text= "Desarrollador Android apasioado por la tecnología y el diseño", fontSize = 16.sp, textAlign = TextAlign.Center, modifier = Modifier.padding(bottom = 20.dp))
                Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp) ) {
                Column (){
                    Text(text = "150",fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                    Text(text = "Posts", fontSize = 16.sp, textAlign = TextAlign.Center)
                }
                Column (horizontalAlignment = Alignment.CenterHorizontally){
                    Text(text = "2.3K",fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                    Text(text = "Seguidores", fontSize = 16.sp, textAlign = TextAlign.Center)

                }
                Column (){
                    Text(text = "980", fontSize = 20.sp, fontWeight = FontWeight.Bold, textAlign = TextAlign.Center)
                    Text(text = "Likes", fontSize = 16.sp, textAlign = TextAlign.Center) }

            }

        Row(horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth().padding(bottom = 20.dp) ) {
                Text(text = "Seguir",color= Color.White,fontSize = 18.sp, modifier = Modifier.background(Color(0xFF6854A4), shape = RoundedCornerShape(20.dp)).padding(horizontal = 52.dp, vertical = 8.dp))
                Text(text = "Mensaje",color= Color(0xFF6854A4),fontSize = 18.sp, modifier = Modifier.border(2.dp,Color(0xFF6854A4), shape = RoundedCornerShape(20.dp)).padding(horizontal = 52.dp, vertical = 8.dp))
        }
        Text(text = "Intereses", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.align(Alignment.Start).padding(bottom = 20.dp))
        Row (horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth().padding(bottom = 5.dp)){
            Text(text = "Ciclismo", modifier = Modifier.background(Color.LightGray, shape = RoundedCornerShape(20.dp)).padding( 8.dp))
            Text(text = "Programación", modifier = Modifier.background(Color.LightGray, shape = RoundedCornerShape(20.dp)).padding( 8.dp))
            Text(text = "UI/UX", modifier = Modifier.background(Color.LightGray, shape = RoundedCornerShape(20.dp)).padding(horizontal = 10.dp, vertical = 8.dp))
        }

        Row (horizontalArrangement = Arrangement.SpaceAround, modifier = Modifier.fillMaxWidth().padding(bottom = 25.dp)){
            Text(text = "Música", modifier = Modifier.background(Color.LightGray, shape = RoundedCornerShape(20.dp)).padding(horizontal = 10.dp, vertical = 8.dp))
            Text(text = "Viajes", modifier = Modifier.background(Color.LightGray, shape = RoundedCornerShape(20.dp)).padding(horizontal = 10.dp, vertical = 8.dp))
            Text(text = "Gaming", modifier = Modifier.background(Color.LightGray, shape = RoundedCornerShape(20.dp)).padding(horizontal = 10.dp, vertical = 8.dp))
        }
        Text(text = "Proyectos Recientes", fontSize = 20.sp, fontWeight = FontWeight.Bold, modifier = Modifier.align(Alignment.Start).padding(bottom = 10.dp))
        Row(modifier = Modifier.fillMaxWidth().background(Color.Gray)){
            Column {
                Image(painter=painter, contentDescription = "ciclista", modifier = Modifier.size(120.dp),contentScale = ContentScale.Crop)
            }
            Column {
                Text(text = "App de Ciclismo", fontSize = 18.sp, fontWeight = FontWeight.Bold, modifier = Modifier.padding(5.dp))
                Text(text = "Aplicacion para rastrear rutas de ciclismo con mapas y estadísticas", fontSize = 13.sp, modifier = Modifier.padding(5.dp, bottom = 20.dp))
                Text(text = "Ver más",color=Color.White, modifier = Modifier.padding(5.dp).align(Alignment.End).background(Color(0xFF6854A4), shape = RoundedCornerShape(20.dp)).padding(horizontal = 10.dp, vertical = 8.dp))
            }


        }



    }
}