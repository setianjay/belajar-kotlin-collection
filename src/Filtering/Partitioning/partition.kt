package Filtering.Partitioning

import com.sun.xml.internal.ws.model.ParameterImpl

fun main() {
    /*
        Jika pada sebelumnya kita melakukan filter maka data yang tidak termasuk kriteria filter akan di buang atau
        tidak dianggap.
        Tetapi jika kita melakukan filtering menggunakan metode "partition" data yang tidak termasuk
        kriteria tersebut mempunyai tempat penampungannya sendiri atau dalam kata lain tidak dibuang.
     */
    val ojolList = listOf("Gojek","Grab","Maxim","Gaspol","Bonceng")

    // Cara 1 melakukan partition
    val partitionOjol: Pair<List<String>,List<String>> = ojolList.partition { it.length < 5 }
    println(partitionOjol.first)
    println(partitionOjol.second)


    // Cara 2 melakukan partition dengan menggunakan Destruction
    val (list1,list2) = ojolList.partition { it.length < 6 }
    println(list1)
    println(list2)
}
