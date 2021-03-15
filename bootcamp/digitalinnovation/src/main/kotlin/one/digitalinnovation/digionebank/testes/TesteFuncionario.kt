package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val robson = Pessoa(nome = "Robson Santos", cpf = "123.123.231-11")
    println(robson.nome)
    println(robson.cpf)

    val joao = Funcionario (nome = "Robson Santos", cpf = "321.321.594-11", salario = BigDecimal.valueOf( 2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)

}