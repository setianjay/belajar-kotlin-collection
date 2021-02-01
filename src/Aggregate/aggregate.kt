package Aggregate

fun main() {
    val listNumber = (1..10).toList()

    println(listNumber.min())
    println(listNumber.max())
    println(listNumber.sum())
    println(listNumber.average())
    println(listNumber.count())

    println(listNumber.sumBy { it / 2 })
}