package liftoff.kotlin.pt3

fun main() {
    val list = mutableListOf("Hello")
    println(list[0].uppercase())
    list.printC()

}

//fun <T> print(collection: List<T>){
//    for(i in collection){
//        println(i)
//    }
//}

fun <T :Any> List<T>.printC(){
    for(i in this){
        println(i)
    }
}

