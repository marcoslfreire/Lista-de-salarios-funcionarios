package com.dio.calcularsalarios.calculadora

class CalculadoraSalarioGerenteIA: CalculadoraSalario {
    override fun calcularSalarioLiquido(salarioBruto: Double): Double {
        val desconto = if (salarioBruto > 7000.00) 0.23 else 0.18
        return salarioBruto - (salarioBruto * desconto)
    }
}