package OperatorGrouping

fun main() {
    /*
    * Grouping adalah operasi untuk meng-group kan element-element di dalam collection*/

    val abjad = listOf("a","a","b","b","c","c","aa","bb","cc")

    val groupByAbjad = abjad.groupBy{ it} // groupBy me return value menjadi Map
    println(groupByAbjad)

    val groupingAbjad = abjad.groupingBy { it } // groupingBy me return value menjadi object Grouping
    println(groupingAbjad)
}