package cheetsheet.constructor.secondary

class Human (val name: String = "", val age: Int = 0, val score: Int = 0) {
    var salary: Int? = null

    // secondary constructor는 꼭 primary constructor에게 객체 생성을 위임해야한다.
    constructor(name: String = "", age: Int = 0, score: Int = 0, salary: Int): this(name, age, score) {
        this.salary = salary
    }
}

fun main() {
    Human("asdf", 33, 28, 33)
}