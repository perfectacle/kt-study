package ch08

import ch01.Person

val people = listOf(Person("Alice", 29), Person("Bob", 31))

fun lookForAlice(people: List<Person>) {
    for (person in people) {
        if (person.name == "Alice") {
            return println("Found!")
        }
    }

    println("Alice is not found")
}

fun lookForAlice2(people: List<Person>) {
    people.forEach(fun (person) {
        if (person.name == "Alice") return println("Found!")
    })
    println("Alice is not found!")
}

fun main() {
    lookForAlice(people)
    lookForAlice2(people)
}