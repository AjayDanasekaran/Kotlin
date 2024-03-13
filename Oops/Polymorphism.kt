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

fun main() {
    // val circle = Circle()
    // println("Area of circle: ${circle.area(5.0)}")

    // val square = Square()
    // println("Area of square: ${square.area(5.0)}")

    val circle : Shape = Circle()
    println("Area of circle: ${circle.area(5.0)}")
    val square : Shape = Square()
    println("Area of square: ${square.area(5.0)}")
}
