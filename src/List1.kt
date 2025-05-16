class List1 {
}

fun main() {
    val listNumber = listOf(1,2,3,4,5,6,7,8,9)

    val div = listNumber.map{ it / 2}
    println(div)

    val citiesList = listOf("Mauá", "São Paulo", "Osasco")
    val modifiedCities = citiesList.map{"Olá $it"}
    println(modifiedCities)



}