package liftoff.kotlin.pt2

fun Int.even(): Boolean {
    this.let{
        return it%2==0;
    }
    return false;
}

fun main() {
    println(4.even())
}