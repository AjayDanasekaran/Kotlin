package liftoff.kotlin.pt2

interface AA {
    fun hello();
}
fun adjusting(ee : AA){
    println(ee.hello())
}

fun main() {
    adjusting(object : AA{
        override fun hello() {
            println("this is from adjusting")
        }
    })
}
