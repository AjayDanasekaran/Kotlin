fun main() {
    val p1 = Phone("Iphone", "X", 4)
    println(p1)
}

class Phone(val name: String, val type: String, var ram: Int) {
    override fun toString(): String {
        return "Phone(name='$name', type='$type', ram=$ram)"
    }
}
