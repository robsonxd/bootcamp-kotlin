package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Pessoa

fun main() {
    val robson = Pessoa(nome = "Robson Santos", cpf = "123.123.231-11")
    println(robson.nome)
    println(robson.cpf)
}