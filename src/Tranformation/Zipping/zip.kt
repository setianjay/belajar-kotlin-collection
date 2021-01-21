package Tranformation.Zipping

fun main() {
    /*
        "zip" berguna untuk menggabungkan 2 buah collection menjadi satu.
     */
    val list1 = setOf("Mister","Hari","Setiaji")
    val list2 = mutableSetOf("Programmer","Akhir","Zaman")

    val list3: List<Pair<String,String>> = list1.zip(list2)
    println(list3)

    // Cara jika kita ingin mengcustom penggabungannya
    val list4 = list1.zip(list2){a, b ->
        "$a $b"
    }
    println(list4)
}