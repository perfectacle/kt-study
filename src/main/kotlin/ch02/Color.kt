package ch02

import ch02.Color.*
import java.lang.Exception

enum class Color(val r: Int, val g: Int, val b: Int) {
      RED(255, 0, 0)
    , GREEN(0, 255, 0)
    , BLUE(0, 0, 255)
    , BLUE2(0, 0, 255)
    ;

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
    when (color) {
        RED -> "Richard"
        GREEN -> "Gave"
        BLUE -> "Battle"
        else -> "asdf"
    }

fun mix(c1: Color, c2: Color) =
    when(setOf(c1, c2)) {
        setOf(RED, GREEN) -> BLUE
        else -> throw Exception("dirty color!")
    }

fun mixOptimzed(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == GREEN)
                || (c1 == GREEN && c2 == RED)
        -> BLUE

        else -> throw Exception("dirty color!")
    }

fun main(args: Array<String>) {
    println(BLUE.rgb())
    println(getMnemonic(RED))
    println(getMnemonic(BLUE2))

    println(mix(RED, GREEN))
    println(mix(GREEN, RED))
    println(mix(GREEN, GREEN))

}