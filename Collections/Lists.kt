fun main(){
    val nums = mutableListOf(1,2,3)
    nums.add(4)
    nums.add(5)
    println(nums)

    val list2 = listOf(4,5,6) // immutable lists
    list2.add(7)
    println(list2) 
}