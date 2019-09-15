package ch08

fun d(x: Int, y: Int): Int = x + y

fun main() {
    val a: (Int, Int) -> Int = fun (x: Int, y: Int) = x + y
    val b: (Int, Int) -> Int = { x: Int, y: Int -> x + y}
    val c: (Int, Int) -> Int = { x, y -> x + y}

    twoAndThree { x, y -> x + y }
    twoAndThree(a)
    twoAndThree(b)
    twoAndThree(c)
//    twoAndThree(d)
    twoAndThree { x, y -> x * y }

    val predicate: (Char) -> Boolean = { it in '0'..'9' }
    val filtered = "ab1c".filter(predicate)
    println(filtered)
}

//fun twoAndThree(operation: (Int, Int) -> Int) {
//    val result = operation(2, 3)
//    println("The result is $result")
//}

fun twoAndThree(operation: (x: Int, y: Int) -> Int) {
    val result = operation(2, 3)
    println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
    val sb = StringBuilder()
    for (index in 0 until length) {
        val element = get(index)
        if (predicate(element)) sb.append(element)
    }
    return sb.toString()
}