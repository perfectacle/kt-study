package ch04.`object`

data class Hiroo(var b: String) {
    var a: String = "${b}_a"
}

fun main() {
    val hiroo = Hiroo("qwer")
    println(hiroo.a)
    println(hiroo.b)
    println(hiroo.hashCode())

    println("===")
    hiroo.a = "123"
    println(hiroo.a)
    println(hiroo.b)
    println(hiroo.hashCode())

    println("===")
    hiroo.b = "222"
    println(hiroo.a)
    println(hiroo.b)
    println(hiroo.hashCode())
}