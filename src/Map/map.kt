package Map

fun main() {
    val map: Map<String,String> = mapOf(
            "a" to "Hari",
            "b" to "Setiaji",
            "c" to "Aprila"
    )

    println(map["a"])
    // getOrDefault(key,defaultValue) = Jika key tidak ada dalam collection maka default valuenya akan di munculkan
    println(map.getOrDefault("d","Tidak ada"))
    for (value in map){
        println(value.toString().replace("="," "))
    }

    for((key, value) in map){
        println("Key $key berisi $value")

//        if (key == "c"){
//            println("ini adalah key a dan isinya adalah $value")
//            break
//        }
    }
}