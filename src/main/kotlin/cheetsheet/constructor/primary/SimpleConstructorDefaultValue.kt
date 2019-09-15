package cheetsheet.constructor.primary

class Human (val name: String = "", val age: Int = 0, val score: Int = 0)

fun main() {
    Human()
    Human(age = 3)
    Human("a", score = 2)
    Human("b", score = 2, age = 3)
}