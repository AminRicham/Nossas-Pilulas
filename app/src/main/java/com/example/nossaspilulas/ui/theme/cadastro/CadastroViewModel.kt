package com.example.nossaspilulas.ui.theme.cadastro

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import com.example.nossaspilulas.remedio.Remedio

class CadastroViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(CadastroUiState(" ",""))
    val uiState: StateFlow<CadastroUiState> = _uiState.asStateFlow()

    var nome by mutableStateOf("")
        private set
    var intervalo by  mutableStateOf("")
        private set

    val listaRemedios = mutableListOf<Remedio>()

    fun adiconaRemedio(){
        val remedioAtual = Remedio(nome, intervalo)
        listaRemedios.add(remedioAtual)
    }

    fun atualizaNome(nome: String){
        this.nome = nome
        _uiState.value = _uiState.value.copy(nome = nome)
    }
    fun atualizaIntervalo(intervalo: String){
//        val intervaloInt = intervalo.toIntOrNull() ?: 0
        this.intervalo = intervalo
        _uiState.value = _uiState.value.copy(intervalo = intervalo)
    }
}
