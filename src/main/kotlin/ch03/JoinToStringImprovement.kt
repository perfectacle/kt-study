package ch03

fun <T> Collection<T>.contains2(a: String) = "faa"

fun <T> Collection<T>.joinToString(
    separator: String = " ,",
    prefix: String = "(",
    postfix: String = ")"
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in this.withIndex()) {
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun Collection<String>.join(
    separator: String = " ,",
    prefix: String = "(",
    postfix: String = ")"
) = joinToString(separator, prefix, postfix)

fun main() {
    val list = listOf(1, 2, 3)
    println(list.joinToString(prefix = "(", separator = ", "))

    val list2 = listOf("a", "b", "c")
    println(list2.join(separator = " "))

    println("asdf".lastChar())

    println(list2.contains2("ee"))
}