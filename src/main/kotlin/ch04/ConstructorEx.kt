package ch04

class User(val nickname: String)

class User2 constructor(nickname: String) {
    val nickname: String

    init {
        this.nickname = nickname
    }
}

class User3 constructor(nickname: String) {
    val nickname: String = nickname
}

class User4(val nickname: String,
            val isSubscribed: Boolean = true)

fun main() {
    val user = User("asdf")
    user.nickname


}