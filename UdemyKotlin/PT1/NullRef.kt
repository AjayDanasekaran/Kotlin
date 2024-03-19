package liftoff.learning.kotlin

fun main() {
    val x : String? = null;
    x?.uppercase()

    val a = "aj" ?: null;
    val b = 1 ?: 2;

    val str2 = x!!
    println(str2)

    x.run { print(this) }

    val s = arrayOf<Int?>(null,null,null)
}