package liftoff.kotlin.pt2

private class AccessMod {
    val id = 10;
}

fun main() {
    val Ac = AccessMod()
    val id = Ac.id
    print(Ac)
}

class Emp(name:String) {
//    val name : String
//    init {
//        this.name = name;
//    }
//
//    val name = name;
    constructor(name : String, lastName : String) : this(lastName)
}
