package ch04

import javax.management.Attribute
import javax.naming.Context

open class UserEx private constructor(val nickname: String = "hey")
//class TwitterUser(nickname: String): UserEx()

open class Button2
class TwitterBUtton(nickname: String): Button2()

open class View2 {
    constructor(ctx: Context)

    constructor(ctx: Context, attr: Attribute)
}

class MyButton: View2 {
    constructor(ctx: Context): this(ctx, null)

    constructor(ctx: Context, attr: Attribute?): super(ctx, attr!!)
}

interface IUser {
    val name: String
}

class PrivateUser(override val name: String) : IUser
