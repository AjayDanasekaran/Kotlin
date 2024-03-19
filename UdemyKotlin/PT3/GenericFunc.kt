package liftoff.kotlin.pt3

fun main() {
    val ints = listOf(1,2,3,4)
    val intsAny : Any = listOf(1,2,3,4)
    val shorts : List<Short> = listOf(10,20,30,40)
//    conversionToPrimitive(shorts);
//    append(StringBuilder("Ajay"), StringBuilder("DANA"))
    printCol(ints)

    if(intsAny is List<*>){
        println("Yes this is a list")
    }
}

fun <T> append(item1 : T, item2 :T) where T: CharSequence, T: Appendable{
    println(item1.append(item2))
}

fun <T : Number> conversionToPrimitive(collection: List<T>){
    for (i  in collection){
        println(i.toInt())
    }
}

fun <T : Any> printCol(collection : List<T>){ // Only Non Nullables allowed
    for(i in collection){
        print("${i} ")
    }
}
