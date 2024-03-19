open class Dad(money: Int) {
    val money: Int = money
}

abstract class Mom : Dad(200) {
    abstract val money1: Int;
    abstract fun greet();
}

class Son : Mom() {
    override val money1 = 300;
    override fun greet() {
        print("HIIII")
    }

    init {
        val totalMoney = money + money1
        println("Total money for Son: $totalMoney")
    }
}

fun main() {
    val son = Son()
}

