package Sequence

fun main() {
    val words = "let's learn and move for the bright future".split(" ")
    println(words)

    val result = words
            .filter {
                println("Filter $it")
                it.length > 3
            }
            .map {
                println("Map $it")
                it.toLowerCase()
            }
            .take(4)

    println(result)

    println("------------------------------")

    /*
    * Sequence adalah sebuah collection yang mana ia mempunyai sifat lazy, yang berarti dia hanya akan di eksekusi
    * jika ia di panggil, kalau tidak di panggil dia tidak di eksekusi.
    *
    * Untuk menandakan dia di panggil maka kita harus men konversinya menjadi list, jika tidak maka ia tidak akan pernah
    * di eksekusi.
    * */
    val sequence = words.asSequence()
    val resultSequence = sequence
            .filter {
                println("Filter $it")
                it.length > 3
            }
            .map {
                println("Map $it")
                it.capitalize()
            }
            .takeWhile { it.length > 3 }

//    println(resultSequence) // Error
    println(resultSequence.toList()) // Meng konversi ke List
}
