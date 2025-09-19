package me.jose.alejandro.tellez.contador

import android.widget.Switch
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextFieldScreen(){
    val context = LocalContext.current
    var inputCantidadACalcular by remember { mutableStateOf("") }
    var checked by remember { mutableStateOf(false) }
    var inputPorcentaje by remember { mutableStateOf("") }

    var cantidad = inputCantidadACalcular.toDoubleOrNull()?:0.0
    var porcentaje = inputPorcentaje.toDoubleOrNull()?:0.0
    //si es nulo(?:), le pone un 0.0
    var resultado = (cantidad * porcentaje)/100
    /**
    if(inputCantidadACalcular.toDoubleOrNull() == null){
        Toast.makeText(context,"Formato Incorrecto", Toast.LENGTH_SHORT).show()
        inputCantidadACalcular = ""
    }

    if(inputPorcentaje.toDoubleOrNull() == null){
        Toast.makeText(context,"Formato Incorrecto", Toast.LENGTH_SHORT).show()
        inputPorcentaje = ""
    }
     **/


    Scaffold { innerPadding ->
        Column (modifier = Modifier.padding(innerPadding).padding(16.dp)){
            Text(text = "Calculos de impuestos", color = Color.Red, fontSize = 25.sp, modifier = Modifier.padding(top = 50.dp, bottom = 16.dp))
            Text(text = "Cantidad : $cantidad", fontSize = 16.sp, modifier = Modifier.padding(bottom = 16.dp))
            Text(text = "Porcentaje: $porcentaje %", fontSize = 16.sp, modifier = Modifier.padding(bottom = 16.dp))

            Spacer(Modifier.height(12.dp))
            TextField(
                label = {
                    Text("cantidad a calcular")
                },
                value = inputCantidadACalcular, onValueChange = { text ->
                    inputCantidadACalcular = text.filter { it.isDigit() }
                                                                }, modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
            )
            Spacer(Modifier.height(12.dp))
            TextField(
                label = {
                    Text("porcentaje")
                },
                value = inputPorcentaje, onValueChange = {text ->
                    inputPorcentaje = text.filter { it.isDigit()}
                                                         }, modifier = Modifier.fillMaxWidth(),
                keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Decimal)
            )
            Spacer(Modifier.height(16.dp))
            Row {
                Text("Redondear Resultado", modifier = Modifier.weight(1f))
                Switch(checked=checked,onCheckedChange = {
                    checked = it

                })
            }
            if (checked){
                Text("Resultado: ${kotlin.math.ceil(resultado)}", fontSize = 25.sp)

            }else{Text("Resultado: $resultado", fontSize = 25.sp)}




        }
    }
}