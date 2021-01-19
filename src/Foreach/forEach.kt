package Foreach

fun main() {
    listOf("Hari","Setiaji","Aprlia","Putri").forEach { value ->
        println(value)
    }

    mutableSetOf("Hari","Setiaji").forEachIndexed { index, value ->
        println("$index = $value")
    }
}