package one.digitalinnovation.collections


fun main() {
    val joao = Funcionario("João", 2000.0, "CLT")
    val pedro = Funcionario("Pedro", 1500.0, "PJ")
    val maria = Funcionario("Maria", 4000.0, "CLT")

    //coleção de funcionários é uma "list"
    val funcionarios = listOf(joao, pedro, maria)

    //o "it" é o funcionário. é a instância do objeto referenciado e alocado no array
    funcionarios.forEach { println(it) }

    println("==================================")
    println("O Find de Maria")
    println(funcionarios.find { it.nome == "Maria" })

    println("==================================")
    println("sortedBy")
    funcionarios.sortedBy { it.salario }.forEach { println(it) }

    println("==================================")
    println("groupBy")
    funcionarios
        .groupBy { it.tipoContratacao }
        .forEach { println(it) }


}

data class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String
    )
{
    override fun toString(): String = """"
     Nome:$nome, Salario:$salario
    """.trimMargin()
}