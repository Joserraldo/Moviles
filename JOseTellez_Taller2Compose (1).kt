package me.jose.alejandro.tellez.taller2jose

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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview
@Composable
fun CardProducto(){
        Card (Modifier.clip(RoundedCornerShape(12.dp))){
            val painter = painterResource(id = R.drawable.iphone)
            Image(
                painter = painter,
                "Iphone",
                modifier = Modifier.height(180.dp).width(200.dp),
                contentScale = ContentScale.Crop
            )
            Column(Modifier.padding(8.dp)) {
                Text("Nombre del producto", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text("Categoria del producto", fontSize = 12.sp, color = Color.Gray)
                Text(
                    "$99.99",
                    fontSize = 18.sp,
                    color = Color(0xfffca21f),
                    fontWeight = FontWeight.Bold
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceBetween,
                    modifier = Modifier.width(180.dp)
                ) {
                    Icon(
                        imageVector = Icons.Default.Edit,
                        contentDescription = null,
                        tint = Color.Gray
                    )
                    Icon(
                        imageVector = Icons.Default.Delete,
                        contentDescription = null,
                        tint = Color.Red
                    )
                }

            }
        }

}

@Preview (showBackground = true)
@Composable
fun ScreenLogin(){

    Column(Modifier.fillMaxSize().padding( 32.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        val painter = painterResource(id = R.drawable.unab)
        Image(
            painter = painter,
            "Unab",
            modifier = Modifier.size(200.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(32.dp))
        Text("Iniciar sesión", fontWeight = FontWeight.Bold, fontSize = 28.sp,color = Color(0xfffca21f))
        Spacer(Modifier.height(24.dp))
        OutlinedTextField(
            value="Correo Electronico",onValueChange={},
            leadingIcon = {Icon(imageVector= Icons.Default.Email,contentDescription= null, tint = Color.Gray)},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            value="Contraseña",onValueChange={},
            leadingIcon = {Icon(imageVector= Icons.Default.Lock,contentDescription= null, tint = Color.Gray)},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(24.dp))
        Button(onClick = {}, Modifier.fillMaxWidth().height(50.dp),colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffca21f)) , shape = RoundedCornerShape(12.dp)) {

            Text("Iniciar Sesión", fontWeight = FontWeight.Bold,color = Color.White)
        }
        Spacer(Modifier.height(24.dp))

        Text("¿No tienes una cuenta? Registrate", fontWeight = FontWeight.Bold,color = Color(0xfffca21f))




    }

}

@Preview(showBackground = true)
@Composable
fun ScreenDetailProduct() {
    Column(modifier = Modifier.fillMaxSize()) {
        Card(Modifier.clip(RoundedCornerShape(12.dp))) {
            Row { val painter = painterResource(id = R.drawable.iphone)
                Image(
                    painter = painter,
                    "Iphone",
                    modifier = Modifier.height(180.dp).width(200.dp),
                    contentScale = ContentScale.Crop
                )
                Icon(
                    imageVector = Icons.Default.Star,
                    contentDescription = null,
                    tint = Color.Yellow
                )
            }

            Column(Modifier.padding(8.dp)) {
                Spacer(Modifier.height(16.dp))
                Text("Nombre del producto", fontWeight = FontWeight.Bold, fontSize = 14.sp)
                Text("Categoria del producto", fontSize = 12.sp, color = Color.Gray)
                Text(
                    "$99.99",
                    fontSize = 18.sp,
                    color = Color.Green,
                    fontWeight = FontWeight.Bold
                )
                Text("Descripción del producto con datos importantes,", fontSize = 12.sp)
                Text("caracteristicas y beneficios", fontSize = 12.sp)


            }
        }
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.width(200.dp)
        ) {
            Button(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Edit,
                    contentDescription = null,
                    tint = Color.White
                )
                Text("Editar", fontWeight = FontWeight.Bold, color = Color.White)
            }
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = Color.Red)
            ) {

                Icon(
                    imageVector = Icons.Default.Delete,
                    contentDescription = null,
                    tint = Color.White
                )
                Text("Eliminar", fontWeight = FontWeight.Bold, color = Color.White)
            }


        }

    }
}

@Preview(showBackground = true)
@Composable
fun ScreenRegister(){

    Column(Modifier.fillMaxSize().padding( 32.dp), horizontalAlignment = Alignment.CenterHorizontally) {
        val painter = painterResource(id = R.drawable.unab)
        Image(
            painter = painter,
            "Unab",
            modifier = Modifier.size(150.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(Modifier.height(32.dp))
        Text("Registro de Usuario", fontWeight = FontWeight.Bold, fontSize = 28.sp,color = Color(0xfffca21f))
        Spacer(Modifier.height(24.dp))
        OutlinedTextField(
            value="Nombre",onValueChange={},
            leadingIcon = {Icon(imageVector= Icons.Default.Person,contentDescription= null, tint = Color.Gray)},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            value="Correo Electrónico",onValueChange={},
            leadingIcon = {Icon(imageVector= Icons.Default.Email,contentDescription= null, tint = Color.Gray)},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            value="Contraseña",onValueChange={},
            leadingIcon = {Icon(imageVector= Icons.Default.Lock,contentDescription= null, tint = Color.Gray)},
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(Modifier.height(16.dp))
        OutlinedTextField(
            value="Confirmar Contraseña",onValueChange={},
            leadingIcon = {Icon(imageVector= Icons.Default.Lock,contentDescription= null, tint = Color.Gray)},
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(24.dp))
        Button(onClick = {}, Modifier.fillMaxWidth().height(50.dp),colors = ButtonDefaults.buttonColors(containerColor = Color(0xfffca21f)) , shape = RoundedCornerShape(12.dp)) {

            Text("Regístrate", fontWeight = FontWeight.Bold,color = Color.White)
        }
        Spacer(Modifier.height(24.dp))

        Text("¿No tienes una cuenta? Registrate", fontWeight = FontWeight.Bold,color = Color(0xfffca21f))




    }
}

@Preview (showBackground = true)
@Composable
fun BasicList(){
Column (Modifier.fillMaxSize().padding(16.dp)){
    Text("Elemento 1")
    Divider()
    Spacer(Modifier.height(8.dp))
    Text("Elemento 2")
    Spacer(Modifier.height(8.dp))
    Divider()
    Text("Elemento 3")
    Divider()
    Spacer(Modifier.height(8.dp))
    Spacer(Modifier.height(8.dp))
    Text("Elemento 4")
    Divider()
    Spacer(Modifier.height(8.dp))
    Text("Elemento 5")
    Divider()
}

}