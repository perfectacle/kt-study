package ch04

class User2 constructor(nickname: String) {
    val nickname: String

    init {
        this.nickname = nickname
    }
}

class User3(nickname: String) {
    val nickname: String

    init {
        this.nickname = nickname
    }
}

class User4 constructor(nickname: String) {
    val nickname: String = nickname
}

class User5(nickname: String) {
    val nickname:String = nickname
}

class User6(nickname: String) {
    val nickname = nickname
}

// primary constructor
class User(val nickname: String)





class User7(val nickname: String = "asdf")