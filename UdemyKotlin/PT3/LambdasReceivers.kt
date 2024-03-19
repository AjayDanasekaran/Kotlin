package liftoff.kotlin.pt3

class LambdasReceivers {
}

fun main() {
    println(count100()
    )
}

//fun count100(): String {
//    val numbers = StringBuilder()
//    for ( i in 1..99){
//        numbers.append(i,",")
//    }
//    return numbers.toString();
//}

//fun count100() =
//    with(StringBuilder()){
//        for ( i in 1..99){
//        append(i,",")
//    }
//        append(100)
//        toString()
//    }

fun count100() =
    StringBuilder().apply{
        for ( i in 1..99){
            append(i,",")
        }
        append(100)
    }

