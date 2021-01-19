package List

fun main() {
    /*
        "List" memiliki sifat Immutable,yang artinya data di dalam List tersebut tidak dapat
        di ubah ataupun di tambah(Read Only).

        "List" merupakan turunan dari "interface Collection".
     */
    val list: List<String> = listOf("Hari","Setiaji","Marganto")

    println(list[2])
    println(list.indexOf("Setiaji"))
    println(list.first())
    println(list.last())
    println(list.contains("Kampret"))
    println(list.containsAll(list))
}

