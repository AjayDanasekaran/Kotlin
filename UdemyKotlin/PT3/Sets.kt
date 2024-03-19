package liftoff.kotlin.pt3

fun main() {
    val setInts = setOf(1,2,3,3)
    println(setInts.plus(4))
    setInts.minus(3) //.average,.drop
    println(setInts)

    println(setInts.filter { it%2!=0 })
}