package cheetsheet.builder

fun alphabetApply() = StringBuilder().apply {
    for (letter in 'A'..'Z') append(letter)
    append("\nNow I know the alphabet!")
}.toString()

fun alphabetBuild() = buildString {
    for (letter in 'A'..'Z') append(letter)
    append("\nNow I know the alphabet!")
}

fun main() {
    println(alphabetApply())
    println(alphabetBuild())
}