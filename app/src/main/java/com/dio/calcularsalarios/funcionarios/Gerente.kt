package com.dio.calcularsalarios.funcionarios

import com.dio.calcularsalarios.calculadora.CalculadoraSalarioGerenteIA

class Gerente(name: String,
              salarioBruto : Double):
    Funcionario(name,
        3,
        salarioBruto,
        CalculadoraSalarioGerenteIA()) {

}