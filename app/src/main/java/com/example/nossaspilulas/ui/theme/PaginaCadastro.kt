package com.example.nossaspilulas.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nossaspilulas.remedio.Remedio
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.foundation.text.KeyboardOptions

@Preview(showBackground = true)
@Composable
fun Pagina_de_Cadastro(modifier: Modifier = Modifier){
    Column {
        var nome by remember { mutableStateOf("") }
        TextField(
            label = { Text("Insira o nome remedio:") },
            value = nome,
            onValueChange = { nome = it },
            modifier = modifier
        )
        var intervalo by remember { mutableStateOf("") }
        TextField(
            label = { Text("Insira o intervalo em horas:") },
            value = intervalo,
            onValueChange = { intervalo = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
        var qtd_dose by remember { mutableStateOf("") }
        TextField(
            label = { Text("Insira a quantidade de cada dose:") },
            value = qtd_dose,
            onValueChange = { qtd_dose = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
        var qtd_dias by remember { mutableStateOf("") }
        TextField(
            label = { Text("Insira por quantos dias ira tomar") },
            value = qtd_dias,
            onValueChange = { qtd_dias = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
        var descricao by remember { mutableStateOf("") }
        TextField(
            label = { Text("Insira a descrição do remedio:") },
            value = descricao,
            onValueChange = { descricao = it },
            modifier = modifier
        )
        var qtd_comprimidos_caixa by remember { mutableStateOf("") }
        TextField(
            label = { Text("Insira a quantidade de comprimidos por caixa:") },
            value = qtd_comprimidos_caixa,
            onValueChange = { qtd_comprimidos_caixa = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
            modifier = modifier
        )
        var remedio = Remedio(nome, intervalo.toInt(), qtd_dose.toFloat(),
            qtd_dias.toInt(), descricao, qtd_comprimidos_caixa.toInt())

    }
}
