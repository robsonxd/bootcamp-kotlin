package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Robson"
    var cpf : String = "123.123.123-11"
    private set

    inner class Endereco {
    var rua : String = "Rua teste"
    }
}

fun main() {
    val Robson = Pessoa()

    println(Robson.nome + " Esse é o nome dele \n")
    println(Robson.cpf)
    println(Robson.Endereco().rua)
}