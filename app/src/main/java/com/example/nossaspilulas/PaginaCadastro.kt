package com.example.nossaspilulas

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.runtime.collectAsState
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.nossaspilulas.ui.theme.Cadastro.CadastroViewModel

@Preview(showBackground = true)
@Composable
fun Pagina_de_Cadastro(
    modifier: Modifier = Modifier,
    cadastroViewModel: CadastroViewModel = viewModel()
){
    val cadastroUiState by cadastroViewModel.uiState.collectAsState()

    Column {
        Informacoes(
            nome = { cadastroUiState.nome},
            intervalo = {cadastroUiState.intervalo},
            dose = {cadastroUiState.dose},
            dias = {cadastroUiState.dias},
            descricao = {cadastroUiState.descricao},
            comprimidosCaixa = {cadastroUiState.comprimidosCaixa}
        )
        Button(
            onClick = { cadastroViewModel.adiconaRemedio(
                cadastroUiState.nome, cadastroUiState.intervalo,
                cadastroUiState.dose, cadastroUiState.dias,
                cadastroUiState.descricao, cadastroUiState.comprimidosCaixa) }
        ) {
            Text(text = "Concluido")
        }
    }
}
@Composable
fun Informacoes(nome:(String) -> Unit,
                intervalo:(String) -> Unit,
                dose:(String) -> Unit,
                dias:(String) -> Unit,
                descricao:(String) -> Unit,
                comprimidosCaixa:(String) -> Unit,
                modifier: Modifier = Modifier)
{
    Column {
        TextField(
            value = "",
            onValueChange = nome,
            modifier = modifier
        )
        TextField(
            value = "",
            onValueChange = nome,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
        TextField(
            value = "",
            onValueChange = intervalo,
            modifier = modifier
        )
        TextField(
            value = "",
            onValueChange = dose,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
        TextField(
            value = "",
            onValueChange = dias,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
        TextField(
            value = "",
            onValueChange = descricao,
            modifier = modifier
        )
        TextField(
            value = "",
            onValueChange = comprimidosCaixa,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
    }
}