package ch05

data class Person (val name: String, val age: Int)

fun main() {
    val people = listOf(Person("Alice", 29), Person("Bob", 31))
    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))
    println(people.maxBy { p: Person -> p.age})
    println(people.maxBy { p -> p.age})

    val sum = {x: Int, y: Int -> x + y}
    println(sum(1, 2))


    val transform: (Person) -> String = { it.name }
    val transform1= { p: Person -> p.name }

    println(people.joinToString(separator = " ") { it.name })
    println(people.joinToString(separator = " ") { p -> p.name })
    println(people.joinToString(separator = " ", transform = { p -> p.name }))

    val sum2 = {x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }

    println(sum2(1, 55))

    println(testFunc())


    val messages = listOf("403 Forbidden", "404 Not Found")
    printMessageWithPrefix(messages, "Error:")

    val createPerson = ::Person
    val p = createPerson("양", 1)
    println(p)
}

fun testFunc(): String = "1"

fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
    var suffix = ""

    messages.forEach {
        suffix += "z"
        println("$prefix $it $suffix")
    }
}