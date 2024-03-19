package liftoff.kotlin.pt3

fun main() {
    val immutableMap = mapOf(1 to "Ajay", 2 to "Dana", 3 to "Aj")
//    mutableMapOf()
//    hashMapOf()

    val pair = Pair(10,"ten")
    println(pair.first)
    println(pair.second)
    val (F,S) = pair
    println(F)
}
