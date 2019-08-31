package ch04

import java.io.File

object CaseInsensitiveFileComparator: Comparator<File> {
    override fun compare(o1: File, o2: File): Int {
        val compareValue = o1.path.compareTo(o2.path, true)
        println(compareValue)
        return compareValue
    }
}

fun main() {
    CaseInsensitiveFileComparator.compare(File("/user"), File("/User"))

    val listOf = listOf(File("/C"), File("/a"))

    println(listOf.sortedWith(CaseInsensitiveFileComparator))
}