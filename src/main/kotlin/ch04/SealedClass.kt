package ch04

sealed class Expr2 {
    class Num(val value: Int): Expr2()
    class Sum(val left: Expr2, val right: Expr2): Expr2()
}

fun eval(e: Expr2): Int = when(e) {
    is Expr2.Num -> e.value
    is Expr2.Sum -> eval(e.left) + eval(e.right)
}




sealed class Expr3
class Num2(val value: Int): Expr3()
class Sum2(val left: Expr3, val right: Expr3): Expr3()

fun eval2(e: Expr3): Int = when(e) {
    is Num2 -> e.value
    is Sum2 -> eval2(e.left) + eval2(e.right)
}