package com.dio.calcularsalarios.funcionarios

import com.dio.calcularsalarios.calculadora.CalculadoraSalarioDesenvovedor

class Desenvolvedor(
    nome: String,
    salarioBruto: Double): Funcionario(nome,0,salarioBruto,CalculadoraSalarioDesenvovedor()) {
}