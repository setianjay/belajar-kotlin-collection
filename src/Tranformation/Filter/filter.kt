package Tranformation.Filter

fun main() {
    val listName = listOf("Hari","Setiaji","Aprilia")

    /*
        filter berfungsi membawa value nya saja untuk di olah
        Memfilter yang mana value yang di tampilkan adalah value yang length nya lebih besar dari 5
     */
    println(listName.filter { value -> value.length > 5 })

    /*
        filterIndexed berfungsi membawa index serta value nya untuk di olah.
        Di bawah filter ini akan menampilkan hasil yang mana urutan indexnya apabila di modulo 2 akan habis atau 0
     */
    println(listName.filterIndexed { index, value -> index % 2 == 0  })


    val listFreedom  = listOf(null,1,"Hari","Setiaji",2,null)
    /*
        filterIsInstance berfungsi untuk memfilter sesuai dengan apa yang kita inginkan.
     */
    println(listFreedom.filterIsInstance<String>()) // Hanya yang bertipe data String saja yang di tampilkan
    println(listFreedom.filterIsInstance<Int>()) // Hanya yang bertipe data Int saja yang di tampilkan

    println(listFreedom.filterNotNull()) // Menampilkan data yang tidak null, jika null maka tidak di anggap

}