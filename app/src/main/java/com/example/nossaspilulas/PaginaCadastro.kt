package com.example.nossaspilulas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.res.stringResource
import com.example.nossaspilulas.ui.theme.cadastro.CadastroUiState
import com.example.nossaspilulas.ui.theme.cadastro.CadastroViewModel

@Preview(showBackground = true)
@Composable
fun Pagina_de_Cadastro(
    modifier: Modifier = Modifier,
    cadastroViewModel: CadastroViewModel = viewModel()
){
    val cadastroUiState by cadastroViewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxSize()) {
        Informacoes(
            nome = cadastroUiState.nome,
            onNomeChange = {cadastroViewModel.atualizaNome(it)},
            intervalo = cadastroUiState.intervalo,
            onIntervaloChange = { cadastroViewModel.atualizaIntervalo(it)}
        )
        Button(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.BottomCenter),
            onClick = { cadastroViewModel.adiconaRemedio() }
        ) {
            Text(text = "Concluido")
        }
    }
}

@Composable
fun Informacoes(
    nome: String,
    onNomeChange: (String) -> Unit,
    intervalo: String,
    onIntervaloChange: (String) -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.TopStart)
    ) {
        TextField(
            label = { Text(text = stringResource(R.string.Label_nome)) },
            value = nome,
            onValueChange = onNomeChange,
            keyboardOptions = KeyboardOptions.Default,
            modifier = modifier
        )
        TextField(
            label = { Text(text = stringResource(R.string.Label_descricao)) },
            value = intervalo,
            onValueChange = onIntervaloChange,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
    }
}