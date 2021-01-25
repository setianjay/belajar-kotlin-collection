package PlusMinusOperator

fun main() {
    /*
    * List dan Set mempunyai default Imutable(Data tidak bisa ditambah,diubah) atau dalam kata lain bernilai tetap.
    *
    * Tapi dengan operation Plus and Minus kita bisa menambahkan data atau menghapus data di dalam List atau Set
    *
    * Operator Plus and Minus tidak hanya bisa untuk List dan Set namun juga bisa untuk Map.
    * */
    val listCollege = listOf("Hari","Setiaji","Aprilia")

    val listManipulate1 = listCollege.plus("Putri")
    println(listManipulate1)

    val listManipulate2 = listCollege.minus("Aprilia")
    println(listManipulate2)

    val mapManipulate = mapOf(
            1 to "Aprlia",
            2 to "Putri",
            3 to "Setiaji"
    )
    val mapManipulate1 = mapManipulate.plus(4 to "Hari")
    println(mapManipulate1)

    val mapManipulate2 = mapManipulate.minus(1)
    println(mapManipulate2)

}