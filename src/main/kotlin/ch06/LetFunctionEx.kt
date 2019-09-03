package ch06

fun sendEmailTo(email: String) {
    println(email)
}

fun main() {
    val email: String? = "asdf"

    email?.let { e -> sendEmailTo(e) }
    email?.let { sendEmailTo(email) }
    email?.let { sendEmailTo(it) }
    email?.let(::sendEmailTo)

//    email.let { sendEmailTo(it) }

    email.isNullOrBlank()
//    email.isEmpty()

    val with = with(email) {
        toString()
    }

    val apply = email?.apply { toString() }

    println()
}