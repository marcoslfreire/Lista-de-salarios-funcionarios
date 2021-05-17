package com.dio.calcularsalarios.calculadora

class CalculadoraSalarioDesenvovedor: CalculadoraSalario {
    override fun calcularSalarioLiquido(salarioBruto: Double): Double {
        val desconto = if (salarioBruto > 3000.00) 0.2 else 0.1
        return salarioBruto - (salarioBruto * desconto)
    }

}