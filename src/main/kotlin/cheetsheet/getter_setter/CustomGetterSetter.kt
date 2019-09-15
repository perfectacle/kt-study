package cheetsheet.getter_setter

// val, var 없으면 멤버 변수로 할당되지 않음.
class HasNotField(name: String)

class Getter(val name: String)

class CustomGetter(name: String) {
    val name = name
        get() = "$field 양"
}

class Setter(var name: String)

class CustomSetter(name: String) {
    var name = "$name James 양"
        set(name) {
            field = "$name James 양"
        }
}

class CustomGetterSetter(name: String) {
    var name = "$name James"
        get() = "$field 양"
        set(name) {
            field = "$name James"
        }
}


fun main() {
    val getter = Getter("asdf")
    println(getter.name)

    println("-------------")
    val hasNotField = HasNotField("asdf")
//    hasNotField.name

    println("-------------")
    val customGetter = CustomGetter("asdf")
    println(customGetter.name)

    println("-------------")
    val setter = Setter("asdf")
    println(setter.name)
    setter.name = "qwer"
    println(setter.name)

    println("-------------")
    val customSetter = CustomSetter("asdf")
    println(customSetter.name)
    customSetter.name = "qwer"
    println(customSetter.name)

    println("-------------")
    val customGetterSetter = CustomGetterSetter("asdf")
    println(customGetterSetter.name)
    customGetterSetter.name = "qwer"
    println(customGetterSetter.name)
}