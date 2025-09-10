package me.jose.alejandro.tellez.elementos.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.Send
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun ComponentePrincipal(){
Column(modifier = Modifier.padding(12.dp)) {
    Card {
        Row(Modifier.padding(12.dp).fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = null, Modifier.size(56.dp))
            Spacer(modifier= Modifier.width(16.dp))
            Column (Modifier.weight(1f)){
                Text("José Alejandro Téllez Prada")
                Text("Ing. Sistemas")
            }
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
            }
        }
    }
    Spacer(Modifier.height(12.dp))

    TextField(
        value="escribe",onValueChange={}, modifier = Modifier.fillMaxWidth()
    )
    Spacer(Modifier.height(12.dp))

    OutlinedTextField(
        value="Escribe",onValueChange={},
        leadingIcon = {Icon(imageVector= Icons.Default.Search,contentDescription= null)},
        trailingIcon = {Icon(imageVector= Icons.Default.Close,contentDescription= null)},
        modifier = Modifier.fillMaxWidth()
    )
    Spacer(Modifier.height(12.dp))
    Row (){
        Button(onClick = {},Modifier.weight(1f)) {
        Text("Enviar")
        Icon(imageVector = Icons.AutoMirrored.Filled.Send, contentDescription = null)

    }
        FilledTonalButton(onClick = {},Modifier.weight(1f)) {
            Icon(imageVector = Icons.AutoMirrored.Filled.Send, contentDescription = null)
            Text("Enviar")
        }
    }
    Spacer(Modifier.height(12.dp))
    Row (verticalAlignment = Alignment.CenterVertically){
        Checkbox(checked = true, onCheckedChange = {})
        Text("Seleccionar") }

    Spacer(Modifier.width(12.dp))

    Row (verticalAlignment = Alignment.CenterVertically){
        Switch(checked = true, onCheckedChange = {})
        Text("Seleccionar") }

}



}
