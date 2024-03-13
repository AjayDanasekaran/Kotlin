object A{
    val a = 10;
}
object B{
    val b = 20;
}
fun main(){
    println(A.a)
    println(B.b)
    var testObj = object{
        fun x(){
            println("x")
        }
    }
    testObj.x()
}