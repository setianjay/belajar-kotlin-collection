package Tranformation.Zipping

fun main() {
    /*
        "zip" berguna untuk menggabungkan 2 buah collection menjadi satu.
     */
    val list1 = setOf("Mister","Hari","Setiaji")
    val list2 = mutableSetOf("Programmer","Akhir","Zaman")

    val list3: List<Pair<String,String>> = list1.zip(list2)
    println(list3)
    // di flat agar menjadi satu collection saja
    val flatList3 = list3.map { it.toList() }.flatten() // cara 1
    var flat1List3 = list3.flatMap { it.toList() } // cara 2
    println(flatList3)
    println(flat1List3)

    // Cara jika kita ingin mengcustom penggabungannya
    val list4 = list1.zip(list2){a, b ->
        "$a $b"
    }
    println(list4)
}