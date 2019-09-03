package ch05

fun main() {
    val list = listOf(1, 2, 3, 4)
    println(list.filter { it % 2 == 0}.map { it * it})

    val people = listOf(Person("did", 1), Person("asdf", 2), Person("zzz", 3), Person("zxcv", 3))
    println(people.map(Person::name))
    println(people.maxBy(Person::age)!!.age)

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })

    println(people.all { it.age > 1 })
    println(people.any { it.age > 1 })
    println(people.count { it.age > 1 })
    println(people.find { it.age > 1 })
    println(people.groupBy { it.age })

    "asdf".first()

    val books = listOf(Book("야야", listOf("a", "b")), Book("니니", listOf("a")))
    println(books.flatMap { it.authors }.toSet())

    val strings = listOf("abc", "def")
    println(strings.map { it.toList() })
    println(strings.flatMap { it.toList() })

    val listOfList = listOf(listOf("a", "ab", "C"), listOf("asdf", "qwer", "zxcv"))
    println(listOfList.flatten())
}