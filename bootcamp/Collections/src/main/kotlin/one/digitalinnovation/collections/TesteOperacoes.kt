package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("========================")
    println("Maior salário é: ${salarios.max()}")
    println("Menor salário é: ${salarios.min()}")
    println("Média salário é: ${salarios.average()}")

    println("========================")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }
}