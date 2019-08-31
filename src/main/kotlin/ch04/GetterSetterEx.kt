package ch04

class SomeUser(val name: String) {
    var address: String = "unspecified"
        set(value) {
            println("===")

            println("""
                Address was changed for $name:
                "$field" -> "$value"
            """.trimIndent())

            println("===")

            field = value
        }
}

fun main() {
    val user = SomeUser("Alice")

    user.address = "목동"

    val counter = LengthCounter()
    println(counter.counter)

    // private setter이기 때문에 직접 할당 못함!
//    counter.counter = 11
    counter.addWord("asdf")
    println(counter.counter)

}

class LengthCounter {
    var counter: Int = 0
        private set

    fun addWord(word: String) {
        counter += word.length
    }
}