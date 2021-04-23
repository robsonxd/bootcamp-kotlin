package com.robx.imcapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()

        infoBTN.setOnClickListener {
            val intent = Intent(this, Tela2::class.java)
            startActivity(intent)


        }
    }
        private fun setListeners() {

            calcularBTN.setOnClickListener {
                calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
            }

        }
        private fun calcularIMC (peso: String, altura: String) {
            val peso = peso.toFloatOrNull()
            val altura = altura.toFloatOrNull()
            if (peso != null && altura != null) {
                val imc = peso / (altura * altura)
                resultadoTXT.text ="Seu Imc é $imc"
                calcularBTN.hideKeyboard()

            }
        }

}
private fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE)
            as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}
