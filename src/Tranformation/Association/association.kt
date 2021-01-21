package Tranformation.Association

fun main() {
    /*
        Association di gunakan untuk mentransformasi "list" ataupun "set" menjadi "map".
     */

    val listName = listOf("Hari","Setiaji","Aprlia")
    // Transformasi dari "list" ke "map"

    /*
        "associate" digunakan untuk menentukan key berserta value nya.
     */
    val map: Map<Int,String> = listName.associate { Pair(it.length,it.toUpperCase()) }
    println(map)


    /*
        "associateWith" digunakan untuk menentukan valuenya saja, dan untuk key nya di ambil berdasarkan value dari list
     */
    val map2: Map<String,Int> = listName.associateWith { it.length }
    println(map2)


    /*
        "associationBy" digunakan untuk menentukan key nya saja, dan untuk valuenya di ambil berdasarkan value dari list
     */
    val map3: Map<Int,String>  = listName.associateBy { it.length * 2 }
    println(map3)
}