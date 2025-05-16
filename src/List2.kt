class List2 {
}

fun main() {
    val citiesList = listOf("São Paulo", "Rio de Janeiro", "Belo Horizonte", "Brasilia")
    val statesList = listOf("São Paulo", "Rio de Janeiro", "Minas Gerais")

    val cityState =citiesList.zip(statesList){city,state-> "$city é a capital do estado $state"}
    println(cityState)
}