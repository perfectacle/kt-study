package ch09

fun <T> copyData(source: List<T>, dest: MutableList<T>) {
    dest.addAll(source)
}

fun <T: R, R> copyData2(source: List<T>, dest: MutableList<R>) {
    dest.addAll(source)
}

fun <T> copyData3(source: List<T>, dest: MutableList<in T>) {
    dest.addAll(source)
}

fun main() {
    val source: List<Int> = listOf(1, 2, 3)
    val dest = mutableListOf(1, 2, 3)
    val source2: MutableList<Any> = mutableListOf("a", "b", "c")
    val dest2: MutableList<Any> = mutableListOf("a", "b", "c")

    copyData(source, dest)
    copyData(source, dest2)
//    copyData(source2, dest)
    copyData(source2, dest2)

    copyData2(source, dest)
    copyData2(source, dest2)
//    copyData2(source2, dest)
    copyData2(source2, dest2)

    copyData3(source, dest)
    copyData3(source, dest2)
//    copyData3(source2, dest)
    copyData3(source2, dest2)

    val list: MutableList<out Number> = mutableListOf(1, 2, 3)
//    list.add(1122)

    val list2: MutableList<in Number> = mutableListOf(1, 2, 3)
    list2.add(122)

    println("a")
}