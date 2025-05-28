class Colecoes {
}

fun main(Banana: String) {

    var cidades = arrayOf<String>("São Paulo", "Rio de Janeiro", "Manaus")

    println(cidades[1])
    println(cidades[2])

    cidades[2] = "Cotia"
    println(cidades[2])

    var temCidade = cidades.isEmpty()
    println(temCidade)


    var valores = arrayOf<Int>()

    var temValor = valores.isEmpty()
    println(temValor)

    println(cidades.size)
    println(valores.size)

    var frutas = ArrayList<String>()
    println("Frutas" + frutas.size)

    frutas.add("Banana")
    frutas.add("Melancia")
    frutas.add("Jaca")
    frutas.add("Maça")
    frutas.add("Uva")
    frutas.add("Uva")




    println("Frutas" + frutas.size)

    println(frutas.contains("Jaca"))
    println(frutas.contains("Manga"))

// visualizar todas a lista
    println(frutas)

    frutas.remove("Banana")
    println(frutas)

}