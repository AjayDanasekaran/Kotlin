
class MyClass{
    companion object Obj{ // only one companion for one class
        val a = 10;
    }
}
fun main(){
    // println(MyClass.Obj.a)
    println(MyClass.a)
}