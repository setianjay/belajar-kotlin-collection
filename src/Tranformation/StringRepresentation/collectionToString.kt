package Tranformation.StringRepresentation

import java.lang.StringBuilder

fun main() {
    /*
        joinToString digunakan untuk merubah "Collection" menjadi "String".
        joinTo digunakan untuk menambahkan value yang mana value tersebut di tampung di dalam suatu properties/appendable
     */

    val listName = listOf("Hari","Setiaji","Inshaallah","Jadi Programmer")
    println(listName.joinToString(" ","|","|"))

    println(listName.joinToString(" ", "<", ">") { it.toUpperCase() }) // With "Transform"


    val builder = StringBuilder()
    listName.joinTo(builder," ","%","%")
    listName.joinTo(builder)
    listName.joinTo(builder,"/","-","-")
    val strBuilder = builder.toString()
    println(strBuilder)
}