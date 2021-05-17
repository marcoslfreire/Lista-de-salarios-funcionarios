package com.dio.calcularsalarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button_carregar)
        val text1 : TextView = findViewById(R.id.tv_title)

        button.setOnClickListener{
            val list = MaquinaSalario().imprimir()
            text1.text = ""
            list.forEach{
                val cargo = when(it.cargo){
                    0 -> "Desenvolvedor\n Salario:"
                    1 -> "Analista\n Salario:"
                    2 -> "Dba\n Salario"
                    else -> "Gerente\n Salario"
                }
                text1.append("${it.nome} \n $cargo -- R$: ${it.calcularSalarioLiquido()} \n\n\n")
            }
        }
    }

}