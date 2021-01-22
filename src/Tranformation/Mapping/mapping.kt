package Tranformation.Mapping

fun main() {
    println("-----------SEPARATOR----------")
    val listStudent = mutableListOf("Danar Winanda","Difa Aldin","Divana Rifky","Hari Setiaji")
    listStudent.map {it.toLowerCase() }.forEach { value -> println(value) }

    println("-----------SEPARATOR----------")
    val listNumbers = mutableListOf("Danar Winanda","Difa Aldin","Divana Rifky","Hari Setiaji")
    listNumbers.map{ it.toUpperCase()}.forEach { value -> println(value) }

    println("-----------SEPARATOR----------")
    val numberRange = (1..100).toList()
    val odd = numberRange.mapNotNull {
        if (it % 2 == 0)  null
        else it
    }
    println(odd)
}