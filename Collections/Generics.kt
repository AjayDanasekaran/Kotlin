class Container<T>(var data: T) {
    fun getDataaaaa(): T {
        return data
    }
}


fun main() {
    val intContainer = Container<Int>(42)
    val stringContainer = Container("Hello, Kotlin!")

    val intValue: Int = intContainer.getDataaaaa()
    val stringValue: String = stringContainer.getDataaaaa()

    println("Data in intContainer: $intValue")
    println("Data in stringContainer: $stringValue")
}
