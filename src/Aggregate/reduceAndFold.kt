package Aggregate

fun main() {
    /*
    * Jika kita ingin membuat fungsi sendiri seperti max,min,count,sum kita bisa memakai fungsi reduces / fold.
    * reduces(R,T) = parameter pertama R berisi element pertama dari sebuah collection,
    * sedangkan T berisi element selanjutnya. setelah proses iterasi pertama selesai maka parameter R di isi dari hasil
    * iterasi sebelumnya.
    * */

    val listNumbers = (1..10).toList()

    val max = listNumbers.reduce { first, second ->
        if (first > second) first
        else second
    }

    println(max)

    val min = listNumbers.reduce{first,second ->
        if (first < second) first
        else second
    }

    println(min)


    val sum = listNumbers.fold(0){first,second ->
        first + second
    }

    println(sum)
}