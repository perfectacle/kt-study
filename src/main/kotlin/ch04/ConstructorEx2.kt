package ch04

import javax.naming.Context
import javax.swing.text.AttributeSet

open class OpenUser

class TwitterUser(val nickname: String): OpenUser()

fun main() {
//    TwitterUser("").ni

//    View()

    println(PrimaryConstructor(22).a)
}

// 주 생성자(클래스 이름 뒤에 괄호가 주 생성자)
open class View {

    // 두 개의 부 생성자
    constructor(ctx: Context) {}

    constructor(ctx: Context, attr: AttributeSet?) {}
}

class MyButton: View {
    constructor(ctx: Context): super(ctx) {}

    constructor(ctx: Context, attr: AttributeSet): super(ctx, attr) {}
}

class MyButton2: View {
    constructor(ctx: Context): this(ctx, null) {}

    constructor(ctx: Context, attr: AttributeSet?): super(ctx, attr) {}
}


class PrimaryConstructor(val a: String) {
    init {
        println("33")
    }

    // 부 생성자는 무조건 주 생성자 혹은 상위 클래스의 생성자 혹은 다른 생성자에게 객체 초기화를 위임해야함.
    constructor(st: Int): this("a") {
        println(st)
    }
}