class List3 {
}

fun main() {
    val citiesList = listOf("São Paulo", "Rio de Janeiro", "Belo Horizonte", "Brasilia")
    val mapCities = citiesList.associateWith { it.length }
    val mapLength = citiesList.associateBy { it.length }

    println(mapCities)
    println(mapLength)


}