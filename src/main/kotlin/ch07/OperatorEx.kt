package ch07

fun main() {
    var listOf = listOf(1, 2, 3)
    listOf += 4

    val mutableListOf = mutableListOf(1, 2, 3)
    mutableListOf += 4

    var point = Point(1, 2)
    point += Point(3, 6)
    point = -point

    val b = point == point

    println(2 shl 3)

    println(point[1])

    val map = mapOf(Pair(1, "a"))
    val s = map[1]

    val mutablePoint = MutablePoint()

    mutablePoint[1] = 22;

    println(point[3])
}

data class Point(val x: Int = 0, val y: Int = 1) {
    operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)
    operator fun unaryMinus(): Point = Point(-x, -y)
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Point

        if (x != other.x) return false
        if (y != other.y) return false

        return true
    }

    override fun hashCode(): Int {
        var result = x
        result = 31 * result + y
        return result
    }

    operator fun get(index: Int): Int = when(index) {
        0 -> x
        1 -> y
        else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
    }

}

data class MutablePoint(var x: Int = 0, var y: Int = 1) {
    operator fun set(index: Int, value: Int) {
        when (index) {
            0 -> x = value
            1 -> y = value
            else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
        }
    }
}