package OperatorGrouping

fun main() {
    /*
    * Interface Grouping memiliki beberapa fungsi diantaranya eachCount(),reduce(),fold(),aggregate()
    * */

    val abjadList = listOf("a","a","b","b","c","c","aa","bb","cc")

    val grouping = abjadList.groupingBy { it }

    println(grouping.eachCount())
    println(grouping.reduce { key, accumulator, element -> accumulator + element  })
    println(grouping.fold(""){accumulator, element -> accumulator + element })
    println(grouping.aggregate { key, accumulator: String?, element, first ->
        if (first) element
        else accumulator + element
    })


}