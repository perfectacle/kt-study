package cheetsheet.constructor.secondary

class Person {
    var name: String
    var age: Int
    var salary: Int

    constructor(name: String = "", age: Int = 0, salary: Int = 0) {
        this.name = name
        this.age = age
        this.salary = salary
    }
}

fun main() {
    Person()
}