package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main() {
    val joao = Analista (nome = "João Pedro", cpf = "321.321.594-11", salario =2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)

}
