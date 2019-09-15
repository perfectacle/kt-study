package ch09

fun addAnswer(list: MutableList<Any>) {
    list.add(42)
}

fun main() {
    val a: List<Number> = listOf(1, 1.4)
    val strings = mutableListOf("abc", "cde")
//    addAnswer(strings)
}

