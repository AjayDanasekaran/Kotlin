package liftoff.kotlin.pt3

class Lists {

}

fun main() {
    val strings = listOf("A","B","C","D") //immutable list
    println(strings.javaClass)

//    val empty = listOf<Int?>() //empty list
    val empty = emptyList<String>()

    val notNull  = listOfNotNull("a") // non empty list
    val arrayList = arrayListOf(1,2,3)
    println( arrayList.javaClass)
}