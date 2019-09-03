package ch05

fun main() {
    val people = listOf(Person("a", 2), Person("b", 2))

    println(people.asSequence()
        .map(Person::name)
        .filter { it.startsWith('a') }
        .toList())

    println("=====")

    println(people
        .filter {
            println("filter $it")
            it.name != null
        }
        .map {
            println("map $it")
            it.name
        }
        .find {
            println("find $it")
            it == "a"
        })

    println("=====")

    println(people.asSequence()
        .filter {
            println("filter $it")
            it.name != null
        }
        .map {
            println("map $it")
            it.name
        }
        .find {
            println("find $it")
            it == "a"
        })
}