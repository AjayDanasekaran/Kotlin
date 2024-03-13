data class Person(var name: String){}
//overrides tostring,hashcode and equals methods

fun main(){
    var p1 = Person("Ajay")
    var p2 = Person("Ajay")
    println("Are the objects equal? ${
        p1 == p2
    }")
    println(p1)
    println( p1.hashCode() == p2.hashCode())

    val (name) = p1 // destructuring
    println(name)
    val p3 = p1.copy()
    println(p3)
}