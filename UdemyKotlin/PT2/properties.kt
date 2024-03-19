package liftoff.kotlin.pt2

//Constants declared at top level
val CONSTANT = 100;

fun main() {
    println(CONSTANT)
    val car1 = Car("Blue","Tx-1200")
    println(car1)
}

//Data Class
data class Car(val color: String , val model: String){

}