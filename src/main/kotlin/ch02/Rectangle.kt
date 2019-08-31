package ch02

import ch03.lastChar
import java.util.*


class Rectangle(val height: Int, var width: Int) {
    val enum = 11

    val isSquare: Boolean = height == width

    val isSquare2: Boolean
        get() = height == width

    val isSquare3: Boolean
        get() {
            return height == width
        }
}

fun main() {
    val rectangle = Rectangle(1, 1)
    println(rectangle.isSquare)
    println(rectangle.isSquare2)
    println(rectangle.isSquare3)
    rectangle.width = 3
    println(rectangle.width)
    println(rectangle.enum)

    val random = Random()
    println(random.nextInt())

    println("asdf".lastChar())
}