package Tranformation.Mapping

fun main() {
    val student = mapOf<Int,String>(
            1 to "Hari Setiaji",
            2 to "Aprilia Putri",
            3 to "Selia Putri Aji"
    )

    val mapKeys = student.mapKeys { it.key*10 }
    println(mapKeys)

    val mapValue = student.mapValues { it.value.toUpperCase() }
    println(mapValue)
}