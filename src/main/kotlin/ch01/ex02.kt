package ch01

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b: Int): Int = if (a < b) b else a

fun max3(a: Int, b: Int) = if (a < b) b else a


fun main() {
    println(max(3, 4))
    println(max2(3, 4))
    println(max3(3, 4))
}