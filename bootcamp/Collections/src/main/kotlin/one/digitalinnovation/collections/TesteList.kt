package one.digitalinnovation.collections


fun main() {
    val joao = Funcionario("João", 1000.0)
    val pedro = Funcionario("Pedro", 2000.0)
    val maria = Funcionario("Maria", 4000.0)

    //coleção de funcionários é uma "list"
    val funcionarios = listOf(joao, pedro, maria)

    //o "it" é o funcionário. é a instância do objeto referenciado e alocado no array
    funcionarios.forEach { println(it) }

    println("==================================")
    println("O Find de Maria")
    println(funcionarios.find { it.nome == "Maria" })
}

data class Funcionario(
    val nome: String,
    val salario: Double
    )
{
    override fun toString(): String = """"
        Nome:   $nome
        Salario: $salario
    """.trimMargin()
}