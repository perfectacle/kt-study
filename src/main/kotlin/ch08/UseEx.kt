package ch08

import java.io.BufferedReader
import java.io.FileReader

fun readFirstLineFromFile(path: String): String = BufferedReader(FileReader(path)).use { it.readLine() }