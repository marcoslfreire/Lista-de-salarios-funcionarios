package com.dio.calcularsalarios.calculadora

class CalculadoraSalarioAnalista: CalculadoraSalario {
    override fun calcularSalarioLiquido(salarioBruto: Double): Double {
        val desconto = if (salarioBruto > 3800.0) 0.25 else 0.20
        return salarioBruto - ( salarioBruto * desconto)
    }
}