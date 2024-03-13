fun looping(n: Int){
    for(i in 1..n){
    }
}

inline fun timeCalculation(func : ()->Unit){ // body gets copy pasted in java hence not a function but the statement
    val start = System.currentTimeMillis()
    func()
    val end = System.currentTimeMillis()
    println(end - start)
}

fun main(){
    timeCalculation {
        looping(1000000)
    }
}