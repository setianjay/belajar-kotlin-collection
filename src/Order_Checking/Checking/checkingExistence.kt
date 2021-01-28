package Order_Checking.Checking

fun main() {
    val listNumber = (1..20).toSet()

    println(listNumber.contains(13)) // Mengecek apakah angka 13 ada di dalam collection (true).
    println(listNumber.containsAll(listOf(10,20,23))) // Mengecek apakah angka yang ada di parameter tersebut ada (false).

    println(listNumber.isEmpty()) // Apakakah data nya kosong, (false)
    println(listNumber.isNotEmpty()) // Apakah data nya tidak kosong, (true)
}