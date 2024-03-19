package liftoff.kotlin.pt3

fun main() {
//   val  num =  if (true) true else false
   val arr = arrayOf("HI", "HELLO", "HEYA", "HOYESAA")
   arr.forEach { it ->
      when (it) {
         "HI" -> println("$it AJAY")
         "HELLO" -> println("$it AJAY")
         "HEYA" -> println("$it AJAY")
         "HOYESAA" -> println("$it AJAY")
      }
   }
}
