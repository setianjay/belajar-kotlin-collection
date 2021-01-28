package Ordering_Checking.Order

fun main() {
    val listAlphabet = ('a' .. 'd')

    val sortedAsc = listAlphabet.sorted()
    println(sortedAsc)
    val sortedDesc = listAlphabet.sortedDescending()
    println(sortedDesc)
}