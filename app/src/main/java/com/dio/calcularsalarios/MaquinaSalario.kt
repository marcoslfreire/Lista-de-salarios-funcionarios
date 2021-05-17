package com.dio.calcularsalarios

import com.dio.calcularsalarios.funcionarios.Analista
import com.dio.calcularsalarios.funcionarios.Dba
import com.dio.calcularsalarios.funcionarios.Desenvolvedor
import com.dio.calcularsalarios.funcionarios.Gerente

class MaquinaSalario {
    fun imprimir() = listOf(
            Desenvolvedor(
                "Marcos Luciano:",
            10000.0

            ),

            Dba(
                "Victor Hugor:",
                7000.0
            ),
            Desenvolvedor(
                "Jose Vitor:",
                15000.0
            ),
            Analista(
                "Thiago Mathes:",
                3000.0
            ),
            Gerente(
                "Alice Unama: ",
                100000.0
            )
        )
    }
