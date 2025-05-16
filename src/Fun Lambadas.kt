class `Fun Lambadas` {
}



fun main() {

    val listNumber = listOf(1,2,3,4,5,6,7,8,9)
    val filtered = listNumber.filter{ it % 2 === 0}
    val filteredNot = listNumber.filterNot {it % 2 ==0 }
    val biggerThan4 = listNumber.filter{ it > 4}

    println(filtered)
    println(filteredNot)
    println(biggerThan4)


}



