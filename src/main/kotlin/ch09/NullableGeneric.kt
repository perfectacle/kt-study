package ch09

class NullableGeneric<T> {
    fun process(value: T) {
        value?.hashCode()
    }
}

class NonNullGeneric<T: Any> {
    fun process(value: T) {
        value?.hashCode()
    }
}

fun main() {
    val nullableGeneric = NullableGeneric<String?>()
    nullableGeneric.process(null)

    val nonNullGeneric = NonNullGeneric<String>()
}