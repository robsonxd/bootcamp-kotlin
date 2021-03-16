package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main() {
    val maria = Gerente(
        nome = "Maria do Carmo",
        cpf = "321.321.594-11",
        salario = 5000.0,
        senha = "senha123"
    )

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autentica(maria)

}
