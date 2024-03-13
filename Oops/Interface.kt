interface Printer{
    fun namePrint()
}
interface Weight{
    fun weightPrint()
}

class ApplePrinter : Printer, Weight{
    override fun namePrint() {
        println("Apple Printer")
    }
    override fun weightPrint() {
        println("Apple Weight")
    }
}
fun main(){
    val applePrinter = ApplePrinter()
    applePrinter.namePrint()
    applePrinter.weightPrint()
    if(applePrinter is ApplePrinter){
        println("Apple Object")
    }
}