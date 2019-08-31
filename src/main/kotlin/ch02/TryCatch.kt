package ch02

import ch03.joinToString
import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException

fun readNumber(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun main() {
    println(readNumber(BufferedReader(StringReader("asdf"))))
    println(readNumber(BufferedReader(StringReader("33"))))

    val list = listOf(1, 2, 3)
    println(joinToString(list, prefix = "(", separator = ", "))
}