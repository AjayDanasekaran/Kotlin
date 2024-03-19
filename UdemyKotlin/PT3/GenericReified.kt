package liftoff.kotlin.pt3

class GenericReified {
}

fun main() {
    val listy = listOf(1,"A",'C',true)
//    println(getElementsType<String>(listy))
    printElementTypes<Any>(listy)
}

inline fun <reified T> getElementsType(list: List<Any>) : List<T> {
    var newlist : MutableList<T> = mutableListOf()
    for(e in list){
        if( e is T){
            newlist.add(e)
        }
    }
    return newlist
}

inline fun <reified T> printElementTypes(list: List<Any>) {
    for (element in list) {
        println("Type of $element is ${element::class.simpleName}")
    }
}