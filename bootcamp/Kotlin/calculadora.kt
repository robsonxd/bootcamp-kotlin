fun main() {
  var x:Int
  var y:Float?
  var z:Float?

  do {
    println("Escolha uma operação a ser realizada")
    println("\n 1 - Soma \n 2 - Subtração \n 3 - Multiplicação \n 4 - Divisão")
    x = readLine()!!.toInt()
    if (x < 1 || x > 4) {
      println("Erro, escolha um valor entre 1 e 4")
    }
  } while (x < 1 || x > 4)
      
  do {
    println("Insira o primeiro número")
    y = readLine()?.toFloat()
    if (y == null) {
      println("Erro, tente novamente")
    }
  } while (y == null)
   
  do {
    println("Insira o segundo número")
    z = readLine()?.toFloat()
    if (z == null) {
      println("Erro tente novamente")
    }
  } while (z == null)
   
  when(x) {
    1 -> println("O resultado é: " + (z.plus(y)))
    2 -> println("O resultado é: " + (z.minus(y)))
    3 -> println("O resultado é: " + (z.times(y)))
    4 -> println("O resultado é: " + (z.div(y)))
    else -> println("Erro tente novamente")
  }
}