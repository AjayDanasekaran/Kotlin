package liftoff.kotlin.pt2

fun main() :Unit {
    println(add(num2 = 2,num1 = 1))
    println(min(1,2,3))
}

fun add(num1 : Int , num2 : Int) = num1+num2;

fun min(vararg nums: Int): Int {
    var minimum = Int.MAX_VALUE
    for (num in nums) {
        minimum = minOf(minimum, num)
    }
    return minimum
}

fun addDefault(num1 : Int  = 1, num2 : Int = 2) = num1+num2;