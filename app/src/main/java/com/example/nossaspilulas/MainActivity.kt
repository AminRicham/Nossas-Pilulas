package com.example.nossaspilulas

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.nossaspilulas.ui.theme.NossasPilulasTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NossasPilulasTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Paginas.Inicial.name,
                    ) {
                        composable(route = Paginas.Inicial.name) {
                            PaginaInicial(onAdicionarRemedioButtonClicked = {
                                navController.navigate(Paginas.Cadastro.name)
                            })
                        }
                        composable(route = Paginas.Cadastro.name) {
                            Pagina_de_Cadastro()
                        }
                    }
                }
            }
        }
    }
}


