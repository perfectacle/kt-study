package cheetsheet.loop

fun isLetter(c: Char) = c.toLowerCase() in 'a'..'z'
fun recognize(c: Char) = when(c.toLowerCase()) {
    in 'a'..'z' -> "It's a letter!"
    else -> "I don't know"
}

fun main() {
    println(isLetter('w'))
    println(recognize('8'))
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))
}