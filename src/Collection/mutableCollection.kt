package Collection

fun <T>displayMutableCollection(MutableCollection: MutableCollection<T>){
    for (value in MutableCollection){
        println("$value")
    }
}

fun main() {
//    displayMutableCollection(listOf("Hari", "Setiaji")) // Error karena bukan turunan dari MutableCollection
//    displayMutableCollection(setOf("Aprilia", "Putri")) // Error karena bukan turunan dari MutableCollection
    displayMutableCollection(mutableListOf("Hari", "Setiaji"))
    displayMutableCollection(mutableSetOf("Aprilia", "Putri"))
//    displayMutableCollection(mapOf("Hari" to "Setiaji")) // Error karena bukan turunan dari MutableCollection
    // Tidak error karena entries mengembalikan mutableSet
    displayMutableCollection(mutableMapOf("Aprilia" to "Putri").entries)
}