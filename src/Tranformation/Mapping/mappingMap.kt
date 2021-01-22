package Tranformation.Mapping

fun main() {
    val student = mapOf<Int,String>(
            1 to "Hari Setiaji",
            2 to "Aprilia Putri",
            3 to "Selia Putri Aji"
    )

    val mapKeys = student.mapKeys {
        if (it.key  == 1){
            println(it.value)
        }
    }
    student.mapKeys { println(it.key * 2) }

    val mapValue = student.mapValues { it.value.toUpperCase() }
    println(mapValue)
}