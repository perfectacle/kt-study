package ch03

fun parsePath(path: String) {
    val directory = path.substringBeforeLast("/")
    val fullName = path.substringAfterLast("/")
    val fileName = fullName.substringBeforeLast(".")
    val extension = path.substringAfterLast(".")

    println("Dir: $directory, name: $fileName, ext: $extension")
}

fun parsePathRegEx(path: String) {
    val regEx = """(.+)/(.+)\.(.+)""".toRegex()
    val matchResult = regEx.matchEntire(path)
    if (matchResult != null) {
        val (directory, fileName, extension) = matchResult.destructured
        println("Dir: $directory, name: $fileName, ext: $extension")
    }
}

fun main() {
    val s = "12.345-6.A"

    println(s.split("[.-]".toRegex()))

    println("12.345-6.A".split("."))
    println("12.345-6.A".split('.'))

    parsePath("/Users/yole/kotlin-book/chapter.02.adoc")
    parsePathRegEx("/Users/yole/kotlin-book/chapter.02.adoc")


    val kotlinLogo = """|  //
                       .| //
                       .|/ \""".trimMargin(".")

    println(kotlinLogo)

    val asdf = "Asdf"

    println("""${'$'} $asdf""")
}