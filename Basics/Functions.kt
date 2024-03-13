fun main(){
    println(add(10,4))
    var concatenation = :: stringsadder
    println(concatenation("ajay","Hi"))
}
fun add(num1 : Int, num2 : Int): Int {
    return num1 + num2;
}
// Function Overloading
fun add(num1 : Int, num2 : Int, num3 : Int): Int {
    return num1 + num2;
}
fun stringsadder(str1 : String, str2 : String): String {
    return str1 + str2;
}