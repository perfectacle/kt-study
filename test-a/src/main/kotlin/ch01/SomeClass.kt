package ch01

class SomeClass(val a: String) {
    /**
     * kt에서 protected 멤버는 상속받은 하위 클래스에서만 접근 가능하기 때문에
     * 상속이 불가능한 final class에서는 protected가 effectively private이기 때문에 private을 권장함!
     */
    protected val b: Int = 1

    fun cc() {
        SomePrivateClass("c")
    }
}

private class SomePrivateClass(val b: String) {
    inner class SomeInternalClass(val b: String) {
        fun a() {
            this.b
            this@SomePrivateClass.b
            SomePrivateClass("")
        }
    }

    class SomeInternalClass2(val b: String) {
        fun bc() {
            this.b
        }
    }
}

fun main() {
    SomePrivateClass("")
}