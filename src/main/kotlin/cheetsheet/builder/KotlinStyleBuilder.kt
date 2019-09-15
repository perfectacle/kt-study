package cheetsheet.builder

class FoodOrder
//private constructor
(
    val bread: String = "",
    val condiments: String = "",
    val meat: String = "",
    val fish: String = ""
) {
    class Builder(
        private var bread: String = "",
        private var condiments: String = "",
        private var meat: String = "",
        private var fish: String = ""
    ) {
        fun bread(bread: String) = apply { this.bread = bread }
        fun condiments(condiments: String) = apply { this.condiments = condiments }
        fun meat(meat: String) = apply { this.meat = meat }
        fun fish(fish: String) = apply { this.fish = fish }
        fun build() = FoodOrder(bread, condiments, meat, fish)
    }
}

fun main() {
    val foodOrder2 = FoodOrder()

    val builder = FoodOrder.Builder()

    val foodOrder = builder.bread("bread")
        .condiments("c")
        .meat("me")
        .fish("fi")
        .build()
}