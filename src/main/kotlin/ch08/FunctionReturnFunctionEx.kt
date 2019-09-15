package ch08

enum class Delivery { STANDARD, EXPEDITED }
class Order(val itemCount: Int)
fun getShippingCostCalculator(delivery: Delivery): (Order) -> Double {
    return if (delivery == Delivery.EXPEDITED) {
        order -> 6 + 2.1 * order.itemCount
    } else {
        order -> 1.2 * order.itemCount
    }
}

fun main() {
    val shippingCostCalculator = getShippingCostCalculator(Delivery.EXPEDITED)
    println("Shipping costs ${shippingCostCalculator(Order(3))}")
}