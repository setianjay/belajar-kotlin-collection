package Iterable

fun <T>displayIterable(iterable: Iterable<T>){
    val iterator = iterable.iterator()

    while (iterator.hasNext()){
        var value = iterator.next()
        println(value)
    }
}


fun main() {
    displayIterable(setOf("Hari", "Setiaji"))
    displayIterable(listOf("Hari", "Setiaji"))
}