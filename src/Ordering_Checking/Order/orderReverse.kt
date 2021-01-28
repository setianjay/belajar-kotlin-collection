package Ordering_Checking.Order

fun main() {
    val listNumber = (1..20).toMutableList()

   /*
   * reversed() berfungsi untuk membalikan sebuah data di collection,
   * seperti sortedByDescending. namun apabila terjadi perubahan pada data yang di olah, maka tidak akan berpengaruh
   * pada proses ini.
   */
    val reversed = listNumber.reversed()
    println(reversed)

    /*
   * asReversed() berfungsi untuk membalikan sebuah data di collection,
   * seperti sortedByDescending. namun apabila terjadi perubahan pada data yang di olah, maka akan berpengaruh
   * pada proses ini dan perubahan data tersebut akan masuk dalam proses ini.
   */

    val asReversed = listNumber.asReversed()
    println(asReversed)

    val addNumber = (21..40).toList()
    listNumber.addAll(addNumber)
    listNumber.remove(25)
    println(asReversed)
}