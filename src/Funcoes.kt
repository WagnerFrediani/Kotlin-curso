fun main() {
    var a = 10
    var b = 20

    somar(a,b)
    somar(5,8)
    somar(98, 20)

    saudar()

    var x = subtrair(6,9)
    var y = subtrair(50,123)
    var z = subtrair(98,11)

    println(x)
    println(y)
    println(z)


}

fun saudar(){
    println("Olá, galera da FIAP!")
}


fun somar(valor1: Int, valor2: Int){
    println("A soma é ${valor1 + valor2 * 10} ")
}

fun subtrair(valor1: Int, valor2: Int): Int{
    var resultado = valor1 - valor2
    return resultado
}

fun dividir(valor1: Int, valor2: Int) = valor1 / valor2

