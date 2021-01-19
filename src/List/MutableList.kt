package List

fun main() {
    /*
        MutableList memiliki sifat mutable,yang artinya data di dalam List tersebut dapat
        di ubah ataupun di tambah datanya(Add and Edit).
     */
    val mutableList: MutableList<String> = mutableListOf()
    mutableList.add("Hari")
    mutableList.add("Setiaji")
    mutableList.add("Margento")
    mutableList.add(1,"Hari")
    mutableList.removeAt(1)

    for (value in mutableList){
        println(value)
    }
}