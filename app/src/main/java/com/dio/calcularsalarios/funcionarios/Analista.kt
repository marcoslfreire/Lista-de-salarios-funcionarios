package com.dio.calcularsalarios.funcionarios

import com.dio.calcularsalarios.calculadora.CalculadoraSalarioAnalista

class Analista(
    name: String,
    salarioBruto: Double
) : Funcionario(name,1,salarioBruto, CalculadoraSalarioAnalista()) {
}