package cheetsheet.constructor.secondary

data class Student(var name: String = "", var age: Int = 0, var score: Int = 0) {
    var hobby: String? = null

    constructor(name: String = "", age: Int = 0, score: Int = 0, hobby: String): this(name, age, score) {
        this.hobby = hobby
    }
}

fun main() {
    val tennis = Student("test", 1, 1, "tennis")
    val soccer = Student("test", 1, 1, "soccer")

    println(tennis == soccer)

    println(tennis.hashCode())
    tennis.hobby = "super tennis"
    println(tennis.hashCode())
    tennis.score = 2
    println(tennis.hashCode())

    println(soccer)

    val (name, age, score) = soccer
}