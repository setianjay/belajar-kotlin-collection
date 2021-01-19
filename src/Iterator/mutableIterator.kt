package Iterator

fun <T>displayMutableIterator(mutableIterator:MutableIterator<T>){
    while (mutableIterator.hasNext()){
        println(mutableIterator.next())
    }
}

fun <T>displayMutableListIterator(mutableListIterator: MutableListIterator<T>){
    while (mutableListIterator.hasNext()){
        val value = mutableListIterator.next()
    }
}

fun main() {
    displayMutableListIterator(mutableListOf("Hari","Setiaji","Aprilia").listIterator())
}