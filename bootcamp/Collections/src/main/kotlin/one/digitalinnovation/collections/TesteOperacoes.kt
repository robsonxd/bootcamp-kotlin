package one.digitalinnovation.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)

    for (salario in salarios) {
        println(salario)
    }
    println("max or null ========================")
    println("Maior salário é: ${salarios.maxOrNull()}")
    println("Menor salário é: ${salarios.minOrNull()}")
    println("Média salário é: ${salarios.average()}")

    println("========================")
    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }
    salariosMaiorQue2500.forEach { println(it) }

    println("========================")
    // Quantos salários estão entre 2000 e 5000?? nesse RANGE
    println(salarios.count { it in 2000.0..5000.0 })

    println("========================")
    // Para buscar valores específicos
    println(salarios.find { it == 2250.0 })
    println(salarios.find { it == 500.0 })

    println("========================")
    // Vamos encontrar qualquer valor onde a expressão seja válida
    println(salarios.any { it == 1000.0 })
    println(salarios.any { it == 500.0 })
}