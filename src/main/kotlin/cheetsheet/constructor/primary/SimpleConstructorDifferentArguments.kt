package cheetsheet.constructor.primary

class Student (name: String, age: Int, salary: Int) {
    val name2: String = name
    val age2: Int = age
    val salary2: Int = salary
}

fun main() {
    val student = Student("", 0, 0)
    student.age2
    student.name2
    student.salary2
}