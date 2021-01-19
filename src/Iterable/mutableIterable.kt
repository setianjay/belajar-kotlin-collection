package Iterable

fun <T>displayMutableIterable(mutableIterable: MutableIterable<T>){
    val iterator = mutableIterable.iterator()

    while (iterator.hasNext()){
        val value = iterator.next()
        println(value)
    }
}

fun main() {
    displayMutableIterable(mutableListOf("Hari","Setiji"))
    displayMutableIterable(mutableSetOf("Aprilia","Putri"))
}