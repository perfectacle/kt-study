package ch09

interface Producer<out T> {
    fun produce(): T
}

open class Animal {
    fun feed() {}
}

class Herd<out T: Animal> {
    val size: Int get() = 2
    operator fun get(i: Int): T = TODO("나도 몰라")
}

fun feedAll(animals: Herd<Animal>) {
    for (i in 0 until animals.size) {
        animals[i].feed()
    }
}

class Cat: Animal() {
    fun cleanLitter() {}
}

fun takeCareOfCats(cats: Herd<Cat>) {
    for (i in 0 until cats.size) {
        cats[i].cleanLitter()
        feedAll(cats)
    }
}

fun testFunc(l: List<Number>) {

}

fun testFunc2(l: MutableList<Number>) {

}

fun main() {
    testFunc(listOf(1))
//    testFunc2(listOf(1))
    val animal = Animal()
    enumerateCats { a: Animal -> a.hashCode() }
}

fun enumerateCats(f: (cat: Cat) -> Number) = f.run {  }