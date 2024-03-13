class Outer{
    inner class Inner{
        fun innerFun(){
            println("Inside inner class")
        }
    }
}
fun main(){
    var obj = Outer().Inner()
    obj.innerFun()
}