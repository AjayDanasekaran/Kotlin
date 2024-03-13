abstract class Shape{
    var name: String = ""
    abstract fun area(): Double
    abstract fun display(): String
}
class Rectangle(val x: Double, val y: Double) : Shape(){
    override fun area(): Double {
        return x * y
    }
    override fun display(): String {
        return "Rectangle"
    }
}

fun main(){
    val rectangle = Rectangle(10.0, 20.0)
    println(rectangle.area())
    println(rectangle.display())
}
