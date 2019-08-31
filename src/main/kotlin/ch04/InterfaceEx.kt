package ch04

interface InterfaceUser {
    val nickname: String
}

class PrivateUser(override val nickname: String): InterfaceUser

class SubscribingUser(val email: String): InterfaceUser {
    override val nickname: String
        get() = email.substringBefore("@")
}

class FacebookUser(val accountId: Int): InterfaceUser {
    override val nickname: String = "test${accountId}"
}

interface InterfaceUser2 {
    val email: String
    val nickname: String
        get() =  email
}

class User22 {
    val email: String = "asdf"
    val nickname: String = email


}

fun main() {
    println(PrivateUser("perfectacle").nickname)

    println(SubscribingUser("perfectacle@gmail.com").nickname)

    println(FacebookUser(122).nickname)
}