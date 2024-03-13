open class Parent{
    open fun hello(){
        println("Hello! from the Parent")
    }
    fun bye(){
        println("Bye! from the Parent")
    }
}

class Child : Parent(){
    override fun hello(){
        println("Hello! from the Child")
    }
}

fun main() {
    val child = Child()
    child.hello()
    child.bye()
}