package liftoff.kotlin.pt3

fun main() {
    val shortList : MutableList<Short> = mutableListOf(1,2,4,5,5,6)
    convertingInt(shortList)
}

fun convertingInt(c : MutableList <out Number>){
    for(i in c ){
        println(i.toInt())
    }

}