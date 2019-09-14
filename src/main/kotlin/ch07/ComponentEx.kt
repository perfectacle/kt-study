package ch07

fun printEntries(map: Map<String, String>) {
    for ((key, value) in map) {
        println("$key -> $value")
    }

    for (entry in map) {
        val (key, value) = entry
        println("$key -> $value")
    }
}

fun main() {
    printEntries(mapOf("Oracle" to "Java",
        "JetBrains" to "Kotlin",
        "JetBrains2" to "Kotlin2",
        "JetBrains1" to "Kotli3",
        "JetBrains3" to "Kotlin4",
        "JetBrains5" to "Kotlin9",
        "JetBrainsf" to "Kotlin1"))
}