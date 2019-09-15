package cheetsheet.constructor.primary

class Person (val name: String, val age: Int, val salary: Int)

class Person2 (name: String, age: Int, salary: Int) {
    val name: String = name
    val age: Int = age
    val salary: Int = salary
}

class Person3 (name: String, age: Int, salary: Int) {
    val name: String
    val age: Int
    val salary: Int

    init { // primary constructor에 있는 변수와 클래스 멤버 변수에만 접근 가능
        this.name = name
        this.age = age
        this.salary = salary
    }
}

fun main() {
    Person("", 0, 2)
    Person2("", 0, 2)
    Person3("", 0, 2)
}