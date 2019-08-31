package ch04

class Client(val name: String, val postalCode: Int) {
    override fun toString() = "Client(name=$name, postalCode: $postalCode)"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if(other !is Client) return false

        if (name != other.name) return false
        if (postalCode != other.postalCode) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + postalCode
        return result
    }
}

fun main() {
    val client = Client("양권성", 123)
    val client2 = Client("양권성", 123)

    println(client)
    println(client == client2)
    println(client === client2)

    val set = hashSetOf(Client("양권성", 123))
    println(set.contains(Client("양권성", 123)))


    println(DataClient("양권성", 123))
    println(DataClient("양권성", 123) == DataClient("양권성", 123))
    println(DataClient("양권성", 123) === DataClient("양권성", 123))

    val set2 = hashSetOf(DataClient("양권성", 123))
    println(set2.contains(DataClient("양권성", 123)))

    val dataClient = DataClient("양권성", 123)
    println(dataClient.hashCode())

    dataClient.age = 22
    println(dataClient.hashCode())

    dataClient.name = "양간지"
    println(dataClient.hashCode())


    println("copy....")
    val copyOfDataClient = dataClient.copy(postalCode = 333)
    println(copyOfDataClient.hashCode())
    println(dataClient.postalCode)
    println(copyOfDataClient.postalCode)
}

data class DataClient(var name: String, val postalCode: Int) {
    var age = 33
}