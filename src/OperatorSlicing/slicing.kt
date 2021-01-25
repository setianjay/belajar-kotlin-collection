package OperatorSlicing

fun main() {
    /*
    * Slice adalah operator yang di gunakan untuk mengambil sebagian element-element pada collection yang sesuai dengan
    * parameter range(Jumlah data yang akan di ambil).
    * */
    val rangeNumber = (0..100).toList()
    println(rangeNumber.slice(0..20))

    println("Angka Genap : " + rangeNumber.slice(0..20 step 2))
    println("Angka Menurun : " + rangeNumber.slice(20 downTo 0 step 2))
}