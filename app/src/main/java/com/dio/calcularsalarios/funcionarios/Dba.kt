package com.dio.calcularsalarios.funcionarios

import com.dio.calcularsalarios.calculadora.CalculadoraSalarioDba

class Dba(
    name: String, salarioBruto: Double): Funcionario(name,2, salarioBruto, CalculadoraSalarioDba()) {
}