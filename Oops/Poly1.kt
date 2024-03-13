open class Shape {
    open fun area(radius: Double = 0.0): Double {
        return 0.0
    }
}

class Circle : Shape() {
    override fun area(radius: Double): Double {
        return Math.PI * radius * radius
    }
}

class Square : Shape() {
    override fun area(side: Double): Double {
        return side * side
    }
}

fun printArea(shape:Shape){
    println(shape.area())
}
fun main(){
    val shape = Shape()
    printArea(shape)
}