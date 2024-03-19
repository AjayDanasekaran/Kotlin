package liftoff.kotlin.pt3

fun main() {
    println(listOf("Ajaa","B","C","D","AKASH").asSequence().filter {
        it[0] == 'A'
    }.map { it.lowercase() }.toList())


}