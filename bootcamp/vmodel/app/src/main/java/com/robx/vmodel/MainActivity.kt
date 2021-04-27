package com.robx.vmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

lateinit var txtContador: EditText
lateinit var btnDados: Button
lateinit var btnMostrar: Button

var contador: Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initDados()
        initContador()
        initClick()
    }

    private fun initClick() {
        btnDados.setOnClickListener {
            contador++
        }

        btnMostrar.setOnClickListener {
            Toast.makeText(this, "Valor Contador: ${contador.toString()}", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initContador() {
        txtContador.setText(contador.toString())
    }

    private fun initDados() {
        txtContador = findViewById(R.id.txtContador)
        btnDados = findViewById(R.id.btnDados)
        btnMostrar = findViewById(R.id.btnMostrar)
    }
}