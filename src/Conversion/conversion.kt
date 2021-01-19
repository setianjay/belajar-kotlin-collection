package Conversion

fun main() {
    // Convert array to "Set","List", "MutableList", and "MutableSet"
    val arrayName: Array<String> = arrayOf("Hari Setiaji","Aprilia Putri")
    val rangeNumber: IntRange = 1..100

    val arrayToList = arrayName.toList()
    val rangeToSet = rangeNumber.toSet()
    val rangeToMutableList = rangeNumber.toMutableList()
    val arrayToMutableSet = rangeNumber.toMutableSet()

    // Convert string to Collection
    val name = "5 2 3 4 1"
    val stringToArray = name.split(" ")
    val arrayToSortedList = stringToArray.toSortedSet().sortedDescending()
    print("${arrayToSortedList.first()},${arrayToSortedList.last()}")

}