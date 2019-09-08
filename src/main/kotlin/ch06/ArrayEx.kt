package ch06

fun main() {
    val array = Array(26) { i -> ('a' + i).toString() }
    println(array.joinToString(""))

    val listOf = listOf("a", "b", "c")
    val of = setOf(1, 3, 2)
    val toTypedArray = of.toTypedArray()
    val stringArray = listOf.toTypedArray()

    val intArray = IntArray(3)
    val intArray1 = IntArray(3) { i -> i }
    val intArrayOf = intArrayOf(1, 2, 3, 4)

    array.forEachIndexed { index, element ->
        println("Argument $index is: $element")
    }
}