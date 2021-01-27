package OperatorTakeDrop

fun main() {
    /*
   * Take fungsinya sama seperti Slice, yaitu untuk mengambil beberapa ataupun semua data.
   *
   * Yang membedakan antara Take dengan Slice adalah kalau di slice mengambil datanya memakai range kalau di take kita
   * bisa memakai kondisi.
   *
   * untuk memakai fungsi take kita harus mengconvert nya terlebih dahulu menjadi List, mengconvert ke Set juga bisa
   * tetapi hanya fungsi take dan takeWhile saja yang bisa, takeLast dan takeLastWhile tidak bisa.
   * */
    val setAlphabethic = ('a' .. 'z').toList()

    println(setAlphabethic.take(3)) // Mengambil data dari 3 urutan index pertama
    println(setAlphabethic.takeLast(3)) // Mengambil data dari 3 urutan index terakhir

    println(setAlphabethic.takeWhile { it < 'd' }) // Mengambil data berdasarkan kondisi yang sudah ditentukan.
    println(setAlphabethic.takeLastWhile { it > 'w' }) // Mengambil data berdasarkan kondisi yang sudah di tentukan.
}