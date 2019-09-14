package ch07

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
    lateinit var s: String
}

class Delegate {
    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
        return "$thisRef, thank you for delegating '${property.name}' to me!"
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String) {
        println("$value has been assigned to '${property.name}' in $thisRef.")
    }
}

fun main() {
    val example = Example()
    println(example.p)
    example.p = "qwer"
    println(example.p)
//    example.s = "123"

    println(example.s)
}