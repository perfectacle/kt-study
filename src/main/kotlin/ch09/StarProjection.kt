package ch09

import java.util.*

fun main() {
    val listOf = mutableListOf(1, 2, 3, "q")
    val listOf1 = mutableListOf('1', '2', '3')
    val list: MutableList<*> = if (Random().nextBoolean()) listOf else listOf1
    val list2: MutableList<out Any?> = if (Random().nextBoolean()) listOf else listOf1

//    list2.add(11)
}

fun printFirst(list: List<*>) {
    if (list.isNotEmpty()) {
        println(list.first())
    }
}