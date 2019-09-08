package ch07

import java.time.LocalDate

data class Rectangle(val upperLeft: Point, val lowerRight: Point)
operator fun Rectangle.contains(p: Point): Boolean {
    return p.x in upperLeft.x .. lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

fun main() {
    val rectangle = Rectangle(Point(10, 20), Point(50, 50))
    println(Point(50, 49) in rectangle)
    println(Point(50, 50) in rectangle)
    println(Point(80, 30) in rectangle)
    val person = Person("Alice", "Johnson")
    val person1 = Person("Bob", "Smith")
    val persons = person .. person1

    println(Person("Alice", "Smith") in persons)

    val now = LocalDate.now()
    val vacation = now..now.plusDays(10L)
    println(now.plusDays(1L) in vacation)

    println((0 .. 9))
    (0 .. 9).forEach { print(it) }

    for (c in "abc") {
        println(c)
    }

    val newYear = LocalDate.ofYearDay(2018, 1)
    val daysOff = newYear.minusDays(1) .. newYear
    for (dayOff in daysOff) println(dayOff)
}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
    object: Iterator<LocalDate> {
        var current = start;
        override fun hasNext(): Boolean = current <= endInclusive

        override fun next(): LocalDate = current.apply {
            current = plusDays(1)
        }
    }