package ch04.`object`

import java.awt.Window
import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

interface JsonFactory<T> {
    fun fromJson(jsonText: String): T
}

class Person(val name: String) {
    companion object: JsonFactory<Person> {
        override fun fromJson(jsonText: String): Person = Person("")
    }
}

fun <T> loadFromJson(factory: JsonFactory<T>): T? {
    return null
}

fun main() {
    loadFromJson(Person)

    val window = Window(null)

    window.addMouseListener(object: MouseAdapter() {
        override fun mouseClicked(e: MouseEvent?) {
            super.mouseClicked(e)
            println()
        }

        override fun mouseEntered(e: MouseEvent?) {
            super.mouseEntered(e)
            println()
        }
    })
}

fun Person.Companion.fromJSON(json: String): Person {
    return Person("a")
}