package Set

import Set.Class.Person

fun main() {
    val mutableSet: MutableSet<Person> = mutableSetOf()

    mutableSet.add(Person("Hari"))
    mutableSet.add(Person("Setiaji"))
    mutableSet.add(Person("Aprilia"))
    mutableSet.add(Person("Hari"))

    for (value in mutableSet){
        println(value)
    }
}