package me.jose.alejandro.tellez.elementos.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun PantallaCompleta(){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Titulo app") },colors= TopAppBarDefaults.topAppBarColors(
                    MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = Color.Red
                ),
                navigationIcon = { Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null) },
                actions = {
                    IconButton(onClick = {}){
                        Icon(imageVector= Icons.Default.Search,contentDescription=null)
                    }
                    IconButton(onClick = {}){
                        Icon(imageVector= Icons.Default.MoreVert,contentDescription=null)
                    }
                }
            )
        }) { innerpadding->
        Column (modifier= Modifier.padding(innerpadding)){
            ComponentePrincipal()
        }
    }
}