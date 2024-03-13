fun operation(x: Int, y: Int, action: (Int, Int) -> Int): Int {
    return action(x, y)
}

fun add(a: Int, b: Int): Int {
    return a + b
}

fun main() {
    val result = operation(10, 5, ::add) // or define lambda function outside 
    println("Result of adding: $result")

    val lambda1 = {x: Int, y: Int -> x + y}

    val multiLineLambde = {
        println("Hello Lambda")
        2 ^ lambda1
    }
    multiLineLambde()

    val singleParam: (Int) -> Int = {x -> x + x};
    val simplifySingleParam : (Int) -> Int = {it + it}
}
