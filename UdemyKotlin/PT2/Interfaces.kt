package liftoff.kotlin.pt2

interface Boat{
    fun drive(){}
    fun fly(){
        println("This boat is flying")
    }
}
class boat1 : Boat{
    override fun drive(){
        println("class boat fly")
    }
    override fun fly(){
        println("class boatfly")
    }
    fun hi() = println("Hi")
}

fun main() {
    val b : Boat = boat1()
    b.drive()
    b.fly()
    val b1 = b as boat1
    b1.hi()
    b1.fly()
}