fun main() {
    val ajay = Person("ajay", 24)
    println(ajay.name)
    println(ajay.age)

    val candidate = Vote(20)
    println(candidate)
}

class Person(name: String, age: Int) {
    var name = name
    var age = age
}

class Vote(age: Int) {
    var vote = age > 18

    init {
        println("congrats")
    }

    init {
        println("congrats 2")
    }
    
}
