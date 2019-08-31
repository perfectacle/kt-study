package ch02

import java.util.*

val binaryReps = TreeMap<Char, String>()

fun main() {
    for (c in '가' until '까' step 2) {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps) println("$letter = $binary")

    val list = arrayListOf("10", "11", "110")

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    println(isLetter('B'))
    println(isNotDigit('3'))
    println(recognize('A'))
    println(recognize('7'))
    println(recognize('ㅁ'))

    println(0 in setOf(0, 3))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A' .. 'Z'
fun isNotDigit(c: Char) = c !in '0'..'9'
fun recognize(c: Char) = when(c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter!"
    else -> "Nothing!"
}