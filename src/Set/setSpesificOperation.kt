package Set

fun main() {
    val number1 = (1..10).toSet()
    val number2 = (6..15).toSet()

    /*
    * union = menggabungkan 2 data collection, apabila terdapat data yang sama maka akan di jadikan satu.
    * */
    println(number1.union(number2))

    /*
    * intersect = mencari data yang sama2 ada di kedua collection.
    * */
    println(number1.intersect(number2))

    /*
    * substract = mencari data yang sama2 tidak ada di kedua collection.
    * */
    println(number2.subtract(number1))
}