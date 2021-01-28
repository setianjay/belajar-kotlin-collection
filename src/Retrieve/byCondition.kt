package Retrieve

fun main() {
    val setChar = ('a'..'z').toSet()

    println(setChar.first { it > 'd' }) // Mengambil data pertama sesuai dengan kondisi yang di tentukan.
    println(setChar.last { it > 'm' }) // Mengambil data terkahir sesuai dengan kondisi yang di tentukan.
    println(setChar.find { it > 'p' }) // Fungsinya sama seperti first{}.
    println(setChar.firstOrNull { it > 'z'  }) // Mengambil data pertama sesuai dengan kondisi, apabila tidak ada (null)
    println(setChar.lastOrNull{ it > 'z'}) // Mengambil data terkahir sesiao dengan kondisi, apabila tidak ada (null)
    println(setChar.findLast { it > 'z' }) // Fungsinya sama seperti findLast{}
}