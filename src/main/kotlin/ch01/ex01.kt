package ch01

data class Person(val name: String,
                  val age: Int? = null)

fun main() {
    val persons = listOf(Person("영희"), Person(age = 22, name = "철수"), Person("철수", 11))
    val oldest = persons.maxBy { it.age ?: 0 }
    println("가장 나이가 많은 사람: $oldest")
}