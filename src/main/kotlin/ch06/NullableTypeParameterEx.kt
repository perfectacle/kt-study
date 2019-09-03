package ch06

fun <T> printHashCode(t: T) {
    println(t?.hashCode())
}

fun main() {
//    printHashCode(null)
    val s = null

    s ?: println(11)
}