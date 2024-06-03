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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.nossaspilulas.ui.theme.NossasPilulasTheme
import androidx.navigation.compose.rememberNavController
import androidx.compose.ui.tooling.preview.Preview
import com.example.nossaspilulas.ui.theme.cadastro.CadastroViewModel

@Composable
fun PaginaInicial(onAdicionarRemedioButtonClicked: () -> Unit,
                  modifier: Modifier = Modifier) {
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
            Button(onClick = { onAdicionarRemedioButtonClicked() }) {
                Text("Adicionar Remedio")
            }
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
enum class Paginas{
    Inicial,
    Cadastro
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

}

private fun adicionaRemedioAndNavigateToStart(
    viewModel: CadastroViewModel,
    navController: NavHostController
) {
    viewModel.adiconaRemedio()
    navController.popBackStack(Paginas.Inicial.name, false)
}
