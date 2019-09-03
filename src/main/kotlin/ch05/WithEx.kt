package ch05

fun alphabet(): String {
    val result = StringBuilder()

    for (letter in 'A'..'Z') {
        result.append(letter)
    }

    result.append("\nNow I know the alphabet!")

    return result.toString()
}

fun main() {
    println(alphabet())
    println(alphabetWith())
}

fun append(c: String) {
}

fun alphabetWith() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        this.append(letter)
    }

    append("\nNow I know the alphabet!")

    toString()
}
