package ch03

class User(val id: Int, val name: String, val address: String)

fun User.validateBeforeSave() {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${this.id}: empty $fieldName")
        }
    }

    validate(name, "name")
    validate(address, "address")
}

fun saveUser(user: User) {
    fun validate(value: String, fieldName: String) {
        if (value.isEmpty()) {
            throw IllegalArgumentException("Can't save user ${user.id}: empty $fieldName")
        }
    }

    validate(user.name, "name")
    validate(user.address, "address")
}

fun saveUser2(user: User) {
    user.validateBeforeSave()
}