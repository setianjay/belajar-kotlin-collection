package Map

fun main() {
    val mutableMap: MutableMap<String,String> = mutableMapOf()

    mutableMap.put("a","Hari")
    mutableMap.put("b","Setiaji")
    mutableMap.put("c","Aprilia")

    println(mutableMap.values) // Hanya menampilkan valuenya saja.
    println(mutableMap.entries) // Menampilan key berserta valuenya.

    for ((key,value) in mutableMap){
        println("$key $value")
    }
}