package liftoff.kotlin.pt3

class CollectionsFunctions {
}

fun main() {
    val strings = listOf("AJAY","UWJAL","ROHAN")
    println(strings.asReversed())
    println(strings.getOrNull(2))
    val strings1 = listOf("Dana","GOWDA","SINGH")
    println(strings.zip(strings1))
    println(listOf(strings,strings1))
    println(listOf(*strings.toTypedArray(),*strings1.toTypedArray()))
    println(listOf(strings.toTypedArray(),strings1.toTypedArray()))
    println(strings+strings1)
}