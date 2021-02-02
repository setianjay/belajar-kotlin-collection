package Map

fun main() {
    val map = mapOf("a" to "Hari","b" to "Aprilia","c" to "Setiaji")

    println(map.entries.joinToString(","){(key,value) -> "$value"}) // map to string
    println(map.get("b"))
    println(map.getValue("b"))
    println(map.getOrDefault("d","Tidak ada"))
    println(map.getOrElse("d",{"Tidak ada"}))

    println(map.filter { it.value.count() > 5 })
    println(map.filterKeys { keys -> keys != "a" })
    println(map.filterValues { value -> value == "Aprilia" })

}