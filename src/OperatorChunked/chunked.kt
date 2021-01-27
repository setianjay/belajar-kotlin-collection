package OperatorChunked

fun main() {
    /*
    * Chunked sama fungsinya dengan Partition hanya saja Partition berfungsi untuk memecah suatu collection menjadi 2,
    * sedangkan chunked bisa memecah collection lebih dari 2.
    * */

    val rangeNumbers = (1..25).toList()

    println(rangeNumbers.chunked(5)) // Kita akan memisahkan collection yang mana tiap datanya hanya ada 5.

    // Jika kita ingin menghitung jumlah dari tiap collection yang di pisahkan, bisa dengan cara ini
    val totalData = rangeNumbers.chunked(5){
        var total = 0
        for (value in it){
            total += value
        }
        total
    }

    println(totalData)
}