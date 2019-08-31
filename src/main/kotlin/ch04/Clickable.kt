package ch04

interface Clickable {
    fun click()
    fun showOff()
}

class Button : Clickable, Focusable {
    override fun showOff() = super.showOff()

    override fun click() = println("I was clicked")
}

fun main() {
    val button = Button()
    button.click()
    button.setFocus(false)
    button.showOff()
    button.setFocus(true)
    button.setFocus(true)
}