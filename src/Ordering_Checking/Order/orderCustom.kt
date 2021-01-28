package Ordering_Checking.Order

data class  Fruit(val name: String, val quantity: Int)

fun main() {
    val fruit = listOf<Fruit>(
            Fruit("Apple",5),
            Fruit("Cherry",3),
            Fruit("Banana",4),
            Fruit("Manggo",15)
    )

    println(fruit.sortedBy { it.quantity }) // Ascending by name
    println(fruit.sortedByDescending { it.name }) // Descending by name

    println(fruit.sortedWith(Comparator { fruit1, fruit2 -> fruit1.quantity.compareTo(fruit2.quantity) })) // Custom
}