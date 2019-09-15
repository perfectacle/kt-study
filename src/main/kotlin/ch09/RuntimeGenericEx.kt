package ch09

fun printSum(c: Collection<*>) {
    val intList = c as? List<Int> ?: throw IllegalArgumentException("type casting error")
    println(c.sum())
}

fun printSum2(c: Collection<Int>) {
    if(c is List<Int>) {
        println(c.sum())
    }
}

inline fun <reified T> isA(value: Any) = value is T

fun main() {
    val list = listOf(1, 2, 3)
    printSum(list)
    val list2 = listOf("1", "3")
//    printSum(list2)
    val set = setOf(1, 2, 3)
//    printSum(set)

    printSum2(list)
//    printSum2(list2)
    printSum2(set)

    println(isA<String>("qwer"))
    println(isA<String>(1122))

    val listOf = listOf("one", 2, "Three")
    println(listOf.filterIsInstance<Number>())
}