package Tranformation.Zipping

fun main() {
    val list1 = setOf("Mister","Hari","Setiaji")
    val list2 = setOf("Programmer","Akhir","Zaman")

    val list3: List<Pair<String,String>>  = list1.zip(list2)

    // cara 1
    val unzipList: Pair<List<String>, List<String>> = list3.unzip()
    println(unzipList.first)
    println(unzipList.second)
    // cara 2
    val (unzip1,unzip2) = list3.unzip()
    println(unzip1)
    println(unzip2)
}