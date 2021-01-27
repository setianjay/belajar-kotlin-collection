package Retrieve

fun main() {

    val setName: Set<String> = setOf("Hari","Setiaji","Aprilia")

    println(setName.first()) // Mengambil data dengan index paling awal "Hari"
    println(setName.last()) // Mengambil data dengan index paling akhir "Aprilia"
    println(setName.elementAt(1)) // Mengambil data dengan index 1 "Setiaji"
    println(setName.elementAtOrNull(3)) // Jika data dengan index yang diambil tidak ada makan akan me return null
    // Jika data dengan index yang diambil tidak ada maka akan mereturn nilai defaultnya yang telah di buat di lambda.
    println(setName.elementAtOrElse(3){ "Index tidak ada"} )
}