package List

fun main() {
    val listName = listOf("Hari","Setiaji","Aprilia")

    // getOrNull() = Apabila data yang di ambil indexnya tidak ada maka akan mengembalikan null
    println(listName.getOrNull(10))

    // getOrElse(){} = Jika index tidak ada, maka akan mengembalikan nilai default
    println(listName.getOrElse(10){"Data tidak ditemukan"})

    // subList = Di gunakan untuk mengambil data di dalam collection bedasarkan awal data(from), jumlah yang di ambil(to)
    println(listName.subList(0,3))

    val sortedName = listName.sorted()
    println(sortedName)

    // Untuk menggunakan binarySearch kita harus membuat data berurut dulu.
    println(sortedName.binarySearch("Hari"))
    println(sortedName.binarySearch("Setiaji"))
    println(sortedName.binarySearch("Aprilia"))


    val listNumbers = listOf(1,1,2,2,2,3,3,4,4,5,5)

    /*
    * indexOf(value) = Mengambil index di dalam collection, apabila terdapat data yang sama maka data dengan urutan
    * paling dulu yang di ambil.
    * return index.
    * */
    println(listNumbers.indexOf(1))

    /*
    * lastIndexOf(value) = Mengambil index di dalam collection, apabila terdapat data yang sama maka data dengan urutan
    * paling akhir yang di ambil.
    * return index.
    * */
    println(listNumbers.lastIndexOf(1))

    /*
    * Mengambil index di dalam collection sesuai dengan kondisi, apabila terdapat data yang sama maka data dengan urutan
    * paling awal yang akan di ambil.
    * return index.
    * */
    println(listNumbers.indexOfFirst { index -> index > 2 })
    println(listNumbers.indexOfLast { index -> index in 4..4 })



}