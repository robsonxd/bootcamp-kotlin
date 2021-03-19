package one.digitalinnovation.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for(valor in values) {
        println(valor)
    }
    println("\n")

    values.forEach { valor ->
        println(valor)


    }
    println("\n")

    for (index in values.indices) {
        println(values[index])
    }
    println("Abaixo é o sort \n")
    values.sort()
    for (valor in values) {
        println(valor)
    }

}