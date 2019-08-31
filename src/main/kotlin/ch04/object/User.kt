package ch04.`object`

class User {
    val nickname: String

    constructor(email: String) {
        this.nickname = email.substringBefore('@')
    }

    constructor(facebookAccountId: Int) {
        this.nickname = "$facebookAccountId"
    }
}

class UserWithObject private constructor(val nickname: String) {
    companion object {
        fun newSubscribingUser(email: String) = UserWithObject(email.substringBefore('@'))
        fun newFacebookUser(accountId: Int) = UserWithObject("$accountId")
    }
}

fun main() {
    val user = UserWithObject.newSubscribingUser("bob@gmail.com")
    val user2 = UserWithObject.newFacebookUser(123)

    println(user.nickname)
    println(user2.nickname)
}