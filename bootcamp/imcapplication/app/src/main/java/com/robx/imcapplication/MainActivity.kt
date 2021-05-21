package com.robx.imcapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.core.widget.doAfterTextChanged
import androidx.core.widget.doOnTextChanged
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {
    companion object {
        var novoImc = "imc"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
        var attempt = findViewById<TextView>(R.id.resultadoTXT)
        infoBTN.setOnClickListener {
            val intent = Intent(this, Tela2::class.java)


            val str: String = attempt.text.toString()
            intent.putExtra(novoImc, str)
            startActivity(intent)
        }


    }
         fun setListeners() {
            calcularBTN.setOnClickListener {
                calcularIMC(pesoEDT.text.toString(), alturaEDT.text.toString())
            }

        }
     fun calcularIMC (peso: String, altura: String) {
            val peso = peso.toFloatOrNull()
            val altura = altura.toFloatOrNull()
            if (peso != null && altura != null) {
                val imc = peso / (altura * altura)
                resultadoTXT.text ="Seu IMC é: ${"%.2f".format(imc)}"
                calcularBTN.hideKeyboard()

            }
        }

}
private fun View.hideKeyboard() {
    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE)
            as InputMethodManager
    imm.hideSoftInputFromWindow(windowToken, 0)
}
