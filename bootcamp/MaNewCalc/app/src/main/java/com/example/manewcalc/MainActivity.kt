package com.example.manewcalc

import android.content.Context
import android.graphics.Color
import android.graphics.Color.GREEN
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btCalcular = calcular
        val btResultado = resultado

        btCalcular.setOnClickListener {

            val nota1 = Integer.parseInt(nota1.text.toString())
            val nota2 = Integer.parseInt(nota2.text.toString())
            val media = (nota1 + nota2)/2
            val faltas = Integer.parseInt(faltas.text.toString())

            if (media >=8 && faltas <=6) {
                resultado.setText("Aluno foi Aprovado" + "\n" + "Nota Final: "+ media+"\n"+ "Faltas: "+faltas)
                resultado.hideKeyboard()
                resultado.setTextColor(Color.GREEN)
            }
            else {
                resultado.setText("Aluno foi Reprovado" + "\n" + "Nota Final: "+ media+"\n"+ "Faltas: "+faltas)
                resultado.hideKeyboard()
                resultado.setTextColor(Color.RED)
            }
        }

    }
    private fun View.hideKeyboard() {
        val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.hideSoftInputFromWindow(windowToken, 0)
    }
}