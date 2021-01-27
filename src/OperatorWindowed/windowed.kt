package OperatorWindowed

fun main() {
    val listNumber = listOf(1,2,3,4,5)
    println(listNumber.windowed(2,1,true))
    println(listNumber.windowed(2,1,false))
    val totalData = listNumber.windowed(2,1,false){
        var total = 0
        for (i in it){
            total += i
        }
        total
    }

    println("Total data dari array di atas adalah : $totalData")
}