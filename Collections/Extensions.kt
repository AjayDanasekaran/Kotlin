fun String.formattedString(): String {
    return "---------$this------------"
}

fun main() {
    val s = "Hello, World!"
    println(s.formattedString())
}
