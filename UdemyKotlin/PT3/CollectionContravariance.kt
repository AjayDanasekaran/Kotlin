interface Consumer<in T> {
    fun accept(item: T)
}

class FruitConsumer : Consumer<Fruit> {
    override fun accept(item: Fruit) {
        println("Consuming ${item.name}")
    }
}

open class Fruit(val name: String)

class Apple : Fruit("Apple")
class Orange : Fruit("Orange")

fun main() {
    val fruitConsumer: Consumer<Apple> = FruitConsumer()

    val apple = Apple()
    val orange = Orange()

    fruitConsumer.accept(apple) // It accepts Apple
    // fruitConsumer.accept(orange) // This line will not compile because fruitConsumer can only accept Apple or its supertypes
}
