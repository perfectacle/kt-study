package cheetsheet.loop

fun main() {
    val oneToTen: IntRange = 1..10
    for (i in oneToTen) {
        println(i)
    }

    println("----------")
    for (i in oneToTen step 3) {
        println(i)
    }

    val oneToNine: IntRange = 1 until 10
    println("----------")
    for (i in oneToNine) {
        println(i)
    }

    val hundredToNinetyOne: IntProgression = 100 downTo 91
    println("----------")
    for (i in hundredToNinetyOne) {
        println(i)
    }

    val aToF: CharRange = 'A'..'F'
    println("----------")
    for (c in aToF) {
        println(c)
    }

    val list: List<Int> = listOf(1, 2, 3)
    println("----------")
    for (i in list) {
        println(i)
    }

    println("----------")
    for ((i, e) in list.withIndex()) {
        println("$i: $e")
    }

    val map: Map<String, String> = mapOf(Pair("key", "value"), Pair("key2", "value2"))
    println("----------")
    for ((k, v) in map) {
        println("$k: $v")
    }

    val map2: Map<String, String> = mapOf("_key" to "_value", "_key2" to "_value2")
    println("----------")
    for ((k, v) in map2) {
        println("$k: $v")
    }
}