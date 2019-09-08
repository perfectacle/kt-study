package ch07

class Person (
    val firstName: String, val lastName: String
) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
//        return compareValuesBy(this, other, { it.lastName },  { it.firstName })
    }
}

fun main() {
    val person = Person("Alice", "Smith")
    val person1 = Person("Bob", "Johnson")
    println(person < person1)
}