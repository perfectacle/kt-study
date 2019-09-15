package ch09

import ch01.Person

fun <T: Number> List<T>.sum2() {
    println(mapOf(1 to mapOf("a" to 3)))
    println(Person("asdf", 22))
//    val b = "asdf".compareTo()
}

fun main() {
    listOf(1, 2, 3).sum2()
//    listOf("1", "2", "#").sum2()
}