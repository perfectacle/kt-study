package ch06

fun main() {
    a("asdf")
    a(null)
}

fun a(s: String?) {
    val toUpperCase = s?.toUpperCase()?.toUpperCase()?.toUpperCase()
    val length = s?.length
    println(if (toUpperCase == null) "else" else toUpperCase)
    println(toUpperCase ?: "else")

    val person = Person("a", "b")
    val equals = person.equals("asdf")

    println()
}

fun b(s: String) {
    val toUpperCase = s.toUpperCase().toUpperCase().toUpperCase()
    val length = s.length
    println(toUpperCase)
}

class Person(val firstName: String, val lastName: String) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        val otherPerson = other as? Person ?: return false

        if (firstName != otherPerson.firstName) return false
        if (lastName != otherPerson.lastName) return false

        return true
    }

    override fun hashCode(): Int {
        var result = firstName.hashCode()
        result = 31 * result + lastName.hashCode()
        return result
    }
}