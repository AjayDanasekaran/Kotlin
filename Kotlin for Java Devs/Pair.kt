fun weather(degree: Int) {
    val (desc, color) = when {
        degree < 10 -> Pair("cold", "Blue")
        degree < 20 -> Pair("mild", "Green")
        else -> Pair("hot", "Red")
        // degree < 10 -> "cold" to "Blue"
        // degree < 20 -> "mild" to "Green"
        // else -> "hot" to "Red"
    }
    println("The weather is $desc. Color: $color")
}

fun main() {
    weather(20)
}
