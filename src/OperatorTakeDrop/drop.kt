package OperatorTakeDrop

fun main() {
   /*
   * Drop sama seperti Take hanya saja drop untuk menghapus data.
   *
   * untuk memakai fungsi drop kita harus mengconvert nya terlebih dahulu menjadi List, mengconvert ke Set juga bisa
   * tetapi hanya fungsi drop dan takeWhile saja yang bisa, takeLast dan takeLastWhile tidak bisa.
   * */

    val numeric = (1..25).toList()

    println(numeric.drop(3)) // Menghapus data dari 3 urutan index pertama
    println(numeric.dropLast(3)) // Menghapus data dari 3 urutan index terkahir
    println(numeric.dropWhile { it < 5 }) // Menghapus data berdasarkan kondisi yang sudah ditentukan.
    println(numeric.dropLastWhile { it > 20 }) // Mengapus data berdasarkan kondisi yang sudah ditentukan.

}