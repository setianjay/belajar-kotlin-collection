package Filtering.Testing

/*
* Testing berfungsi untuk mengecek data di dalam collection, dan hasil dari testing ini berupa boolean.
*
* Any  = mengecek apakah ada salah satu data atau semua data di dalam collection yang sesuai dengan kondisi(lambda),
*        jika ada maka (true).
*
* None = mengecek apakah tidak ada data di dalam collection yang sesuai dengan kondisi(lambda),
*        jika benar tidak ada fungsi ini akan mengembalikan nilai (false).
*
* All  = Mengecek apakah semua data sesuai dengan kondisi(lambda)
*  */

fun main() {
    val setName = setOf("Hari","Setiaji","Aprilia")
    println(setName.any()) // Mengecek apakah ada data di dalam collection setName ? ada (True)
    println(setName.none()) // Mengecek apakah tidak ada data di dalam collection setName ? ada (False)

//    Lambda Version
    println(setName.any { it.length > 4 }) // Mengecek apakah ada data yang panjangnya lebih dari 4 ? ada(True)
    println(setName.none { it.length > 7 }) // Mengecek apakah tidak ada data yang panjangnya lebi dari 7 ? tidak ada(true)
    println(setName.all { value -> value.length > 1 })
}