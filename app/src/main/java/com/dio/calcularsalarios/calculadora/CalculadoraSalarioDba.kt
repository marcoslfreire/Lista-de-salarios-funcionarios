package com.dio.calcularsalarios.calculadora

class CalculadoraSalarioDba : CalculadoraSalario {
    override fun calcularSalarioLiquido(salarioBruto: Double): Double {
        val desconto = if (salarioBruto > 2500.0) 0.25 else 0.15
            return salarioBruto - (salarioBruto * desconto)
    }
}