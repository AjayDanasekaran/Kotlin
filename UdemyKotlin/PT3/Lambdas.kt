package liftoff.kotlin.pt3

fun main() {
//    run { println("I'm in a lambda") }
    val empList = listOf(Emp("Ajay","A"),Emp("Ajay","B"),Emp("Ajay","C"))
    println(empList[0])

    var num =10
    run {
        num+=15;
        println(num)
    }

}

data class Emp(val firstName: String, val lastName : String){

}