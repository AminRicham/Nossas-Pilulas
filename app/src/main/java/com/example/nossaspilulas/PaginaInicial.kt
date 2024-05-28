package com.example.nossaspilulas

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.nossaspilulas.remedio.Remedio
import com.example.nossaspilulas.ui.theme.NossasPilulasTheme

@Preview(showBackground = true)
@Composable
fun PaginaInicial(modifier: Modifier = Modifier) {
    NossasPilulasTheme {
        //Titulo
        Column(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopCenter)) {
            Titulo(modifier = Modifier.padding(top = 8.dp))
        }

        //Lista de remedios
        Column(modifier = Modifier
            .padding(
                start = 8.dp,
                top = 30.dp
            )) {
            ListaRemedios(
                modifier = Modifier
                    .fillMaxSize()
                    .wrapContentSize(Alignment.TopStart)

            )
        }
        //Botão Adicionar Remedios
        Column(modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.BottomCenter)) {
            AdicionaRemedio(modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.Center)
            )
        }

    }
}

@Composable
fun Titulo(modifier: Modifier = Modifier){
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ){
        Text(text = "Nossas Pílulas",
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ListaRemedios(modifier: Modifier = Modifier){
    Column(horizontalAlignment = Alignment.Start){
        Button(onClick = { /*TODO*/ }) {
            Text("Remedio 1")

        }
        Button(onClick = { /*TODO*/ }) {
            Text("Remedio 2")

        }
    }
}

@Composable
fun AdicionaRemedio(modifier: Modifier = Modifier){
    Button(onClick = { /*TODO*/ }) {
        Text("Adicionar Remedio")
    }
    val listaRemedio = mutableListOf<Remedio>()
}
