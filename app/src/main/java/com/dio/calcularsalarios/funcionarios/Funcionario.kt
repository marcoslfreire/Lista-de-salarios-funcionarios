package com.dio.calcularsalarios.funcionarios

import com.dio.calcularsalarios.calculadora.CalculadoraSalario
open class Funcionario(
    val nome: String,
    val cargo: Int,
    val salarioBruto: Double,
    val calcularSalario: CalculadoraSalario
) {
    fun calcularSalarioLiquido(): Double{
        return calcularSalario.calcularSalarioLiquido(salarioBruto)
    }
}