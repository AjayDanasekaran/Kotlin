package liftoff.kotlin.pt2

fun main() {
//    A.Companion.printer()
//    A.just.printer()
    A.printer()

}

class A{
//    private var pa = 1
//        get() {return field}
//        set(value){field = value}
//
//    fun print(){
//        println("$pa is the value")
//    }

    companion object just{
        private var pa =1;

    fun printer(){
        println("$pa is the value")
    }
    }
}