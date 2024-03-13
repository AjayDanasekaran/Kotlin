data class Employee(var name: String = "", var age: Int = 18)

fun main(){
    val emp = Employee()
    var x  = emp.apply{
        name = "ajay"
        age = 24
    }

    x?.let{ println(it.name) }
    with(emp){
        name = "aj"
        age = 29
    }

    emp.run{
        name = "ajay"
        age = 24
    }
    // println(x)
}