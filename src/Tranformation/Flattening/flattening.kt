package Tranformation.Flattening

class Member(val name: String, val hobbies: List<String>)

fun main() {
    // Contoh collection di dalam collection(Nested Collection / Array Associative)
    val merkPhone: List<List<String>> = listOf(
            listOf("Advan","Mito","Evercross","Bluberry"),
            listOf("Samsung","Xiaomi","Oppo","Realme"),
            listOf("Vivo","Huawei","Nokia","Sony")
    )

    println(merkPhone)

    // Jika kita ingin mengubah collection diatas menjadi single collection maka gunakan fungsi "flatten()"
    println(merkPhone.flatten())


    val members: List<Member> = listOf(
            Member("Hari Setiaji", listOf("Gaming","Learning","Coding")),
            Member("Gurindo Sekti", listOf("Investating","Learning","Farming"))
    )
    val hobbies = members.map { it.hobbies }.flatten()
    println(hobbies)

    val hobbies2 = members.flatMap { it.hobbies }
    println(hobbies2)

}