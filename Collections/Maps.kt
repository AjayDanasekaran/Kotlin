fun main(){
    val students = mutableMapOf<Int, String>()
    students.put(1,"A")
    students.put(2,"B")
    println(students)
    for((key, value) in students){
        println("$key $value")
    }

    val immutableMap = MapOf<Int, String>()
}