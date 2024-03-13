fun main(){
    var gender = String? = null;
    gender?.toUpperCase()
    gender?.let{
        println("Line 1")
        it.toUpperCase()
    }

    var value = gender ?: "NA" //exists take gender else "NA"
    var val = gender!!.toUpperCase() //not null executes otherwise exception
}