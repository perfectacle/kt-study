//package ch04
//
//import java.io.Serializable
//
//interface State: Serializable
//
//interface View {
//    fun getCurrentState(): State
//    fun restoreState(state: State) {}
//}
//
//fun main() {
//    val button2 = Button2(11)
//}
//
//class Button2(val b: Int) : View {
//    override fun getCurrentState(): State {
//        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
//    }
//
//    inner class ButtonState(val c: Int): State {
//        fun qwer() = this@Button2
//
//        fun asdf() {
//            this.c;
//            c;
//
//            this.asdf()
//
//            this@Button2.ButtonState()
//        }
//    }
//
//    fun a(x: Any): Unit {
//        val buttonState = ButtonState()
//    }
//}
//
//class ButtonTest : Button2() {
//
//}