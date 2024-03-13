open class Laptop(val name: String, var price: Double, var weight: Double, var color: String) {
    init {
        println("Initializing Parent class $name laptop")
    }
}

class Asus : Laptop("Asus", 1000.0, 100.0, "Blue") {
    init {
        println("Initializing Asus laptop")
    }
}

fun main() {
    val asusLaptop = Asus()
    println("Name: ${asusLaptop.name}")
    println("Price: ${asusLaptop.price}")
    println("Weight: ${asusLaptop.weight}")
    println("Color: ${asusLaptop.color}")
}
