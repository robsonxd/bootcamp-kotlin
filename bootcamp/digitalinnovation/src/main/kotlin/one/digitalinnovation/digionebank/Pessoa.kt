package one.digitalinnovation.digionebank

class Pessoa {
    var nome : String = "Robson"
    var cpf : String = "123.123.123-11"
    private set

    

    fun pessoaInfo() = "$nome e $cpf"
}

fun main() {
    val robson = Pessoa()


    println(robson.pessoaInfo())

}