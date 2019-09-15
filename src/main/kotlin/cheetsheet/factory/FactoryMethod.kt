package cheetsheet.factory

class FoodOrder
private constructor
    (
    val bread: String = "",
    val condiments: String = "",
    val meat: String = "",
    val fish: String = ""
) {
    companion object {
        fun normalBread(): FoodOrder = FoodOrder("normalBread")
        fun specialBread(meat: String = ""): FoodOrder = FoodOrder("specialBread", meat = meat)
        fun test() {

        }
    }

    fun a() {}
}

fun testFunction() {
    FoodOrder.specialBread("qwer")
}

fun main() {
    val normalBread = FoodOrder.normalBread()
}