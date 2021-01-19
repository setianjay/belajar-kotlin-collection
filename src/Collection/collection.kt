package Collection

fun <T>displayCollection(collection: Collection<T>){
    for (value in collection){
        println("$value")
        }

}

fun main() {
    displayCollection(listOf("Hari","Setiaji"))
    displayCollection(setOf("Aprilia","Putri"))
    displayCollection(mapOf("Gurindo" to "Sekti").entries) // Tidak error karena entrires mengembalikan Set
//    displayCollection(mapOf("Tusro" to "Bismiro")) // Error karena map bukan turunan dari Collection
}