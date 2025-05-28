fun main() {
    var filmes = HashSet<String>()
    println(filmes.size)

    filmes.add("Homem Aranha")
    filmes.add("Harry Potter")
    filmes.add("Super Mario")

    println(filmes.size)
    println(filmes)

    filmes.add("Homem Aranha")
    println(filmes)

    filmes.add("Homem Aranha 2")
    println(filmes)

    println(filmes.contains("Super Mario"))
    println(filmes.contains("Super Mario 2"))

    filmes.remove("Homem Aranha 2")
    println(filmes)


    var precos = setOf(45.9, 78.6, 65.9, 41.9)
    println(precos)


    var produtos = HashMap<String, Double>()
    produtos.put("Mouse", 149.99)
    produtos.put("Teclado", 249.99)
    produtos.put("Monitor", 500.99)

    println(produtos)
    println(produtos.size)

    produtos.remove("Mouse")
    println(produtos)

    println(produtos.get("Teclado"))
}



