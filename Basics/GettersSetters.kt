fun main() {
    val a1 = Animal("ruby", 3)
    println("--------------------------------")
    println(a1.getAnimalInfo())
    a1.setAnimalAge(4)
}

class Animal(name: String, age: Int) {
    var name = name
    var age = age
        set(value) {
            field = value
        }
        get() {
            return field
        }

    fun eat() {
        println("$name is eating")
    }

    fun sleep() {
        println("$name is sleeping")
    }

    fun getAnimalInfo(): String {
        return "Pet $name is $age years old"
    }

    fun setAnimalAge(newAge: Int) {
        age = newAge
        println("Age has been updated to $age")
    }
}
