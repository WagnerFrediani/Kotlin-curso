class List4 {

}

fun main() {
    val citiesList = listOf("São Paulo", "Rio de Janeiro", "Belo Horizonte", "Brasilia")

    citiesList.filter {
        it.length > 6
    }.map{
        "Olá $it"
    }.forEach{
    println(it)
    }
}