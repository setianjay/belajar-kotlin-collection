package Set

import Set.Class.Person

fun main() {
    /*
        "Set" adalah collection yang mana data nya itu harus unik, jika ada yang sama maka data tersebut
        tidak akan di terima. Tetapi untuk mengecek data itu sama atau tidak kita harus meng override function
        hashCode dan equal, jika tidak maka data yang terindikasi sama tersebut akan tetap masuk ke collection.

        "Set" memiliki sifat Immutable,yang artinya data di dalam Set tersebut tidak dapat
        di ubah ataupun di tambah(Read Only).

        "Set" merupakan turunan dari "interface collection".
     */

    val set: Set<Person> = setOf(
            Person("Hari"),Person("Setiaji"),Person("April"),Person("Hari")
    )

    for (value in set){
        println(value)
    }
}