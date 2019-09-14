package ch07

class Person (
    val firstName: String, val lastName: String
) : Comparable<Person> {
    override fun compareTo(other: Person): Int {
        return compareValuesBy(this, other, Person::lastName, Person::firstName)
//        return compareValuesBy(this, other, { it.lastName },  { it.firstName })
    }

    private var _emails: List<String>? = null
    val emails: List<String>
    get() {
        if(_emails.isNullOrEmpty()) {
            println("초기화 중!")
            _emails = listOf("default", "emails")
        }
        return _emails!!
    }

    val mailings by lazy {
        println("초기화 중!")
        listOf("default", "mailings")
    }
}

fun main() {
    val person = Person("Alice", "Smith")
    val person1 = Person("Bob", "Johnson")
    println(person < person1)

    println(person.emails)
    println(person.emails)
    println(person.mailings)
    println(person.mailings)
}