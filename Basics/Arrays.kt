fun main(){
    var arr = arrayOf(1, 2, 3, 4, 5, 6)
    println(arr[1])
    arr.get(1)
    arr.set(0,9)
    arr.size()

    for(i in arr){
        println(i)
    }

    for((i,e) in  arr.withIndex()) {
        println("$e at index $i")
    }
}