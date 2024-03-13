fun main(){
    val arr = arrayOf(1,2,3)
    try{
    println(arr[5])
    }catch(e: ArrayIndexOutOfBoundsException){
        println(e.message)
    }
    finally{
        println("Finally")
    }
}