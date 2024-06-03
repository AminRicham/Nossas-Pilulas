package com.example.nossaspilulas

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.res.stringResource
import com.example.nossaspilulas.ui.theme.cadastro.CadastroViewModel


@Composable
fun Pagina_de_Cadastro(
    onConcluidoButtonClicked: () -> Unit,
    modifier: Modifier = Modifier,
    cadastroViewModel: CadastroViewModel = viewModel()
){
    val cadastroUiState by cadastroViewModel.uiState.collectAsState()

    Column(modifier = Modifier.fillMaxSize()
        .wrapContentSize(Alignment.Center)) {
        Informacoes(
            nome = cadastroUiState.nome,
            onNomeChange = {cadastroViewModel.atualizaNome(it)},
            intervalo = cadastroUiState.intervalo,
            onIntervaloChange = { cadastroViewModel.atualizaIntervalo(it)},
            modifier = Modifier.fillMaxWidth()
                .wrapContentSize(Alignment.Center)
        )
        Button(
            modifier = Modifier
                .fillMaxSize()
                .wrapContentSize(Alignment.BottomCenter),
            onClick = { onConcluidoButtonClicked() }
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
            .wrapContentSize(Alignment.TopCenter)
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