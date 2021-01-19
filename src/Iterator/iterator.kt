package Iterator

fun <T>displayIterator(iterator: Iterator<T>){
    while (iterator.hasNext()){
        val value = iterator.next()
        println(value)
    }
}

fun <T>displayListIterator(listIterator: ListIterator<T>){
    println("Data di tampilkan maju")
    while (listIterator.hasNext()){
        println(listIterator.next())
    }

    println("Data di tampilan mundur")
    while (listIterator.hasPrevious()){
        println(listIterator.previous())
    }
}

fun main() {
    displayListIterator(listOf("Hari","Setiaji","Aprilia").listIterator())
}