package ch07

class Person2 {
    private val _attributes = hashMapOf<String, String>()
    fun setAttribute(name: String, value: String) {
        _attributes[name] = value
    }

//    val name: String
//    get() = _attributes["name"]!!

    val name: String by _attributes
}

fun main() {
    val person2 = Person2()
    val data = mapOf("company" to "MS", "name" to "ygs")
    for ((name, value) in data) {
        person2.setAttribute(name, value)
    }

    println(person2.name)
}