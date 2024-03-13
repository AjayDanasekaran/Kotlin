fun main(){
    val nums = listOf(1,2,3,4,5)

    nums.forEach{ println("$it") } 
    println(isOdd(3))

    val list = nums.filter({ it -> isOdd(it)})
    // val list = nums.filter( it%2!=0) //Lambda Expression
    println(list)

    val userList : List<User> = listOf(
        User(1,"ajay"),
        User(2,"ajy"),
        User(3,"aja"),
    )

    val list1 = nums.map {it * it}

    println(list1)
    // println(userList.filter{it.id==2})
}

fun isOdd(num: Int): Boolean{
    return num % 2 != 0
}

data class User(val id: Int, val name: String)