
//kotlin Higher Order Function


fun main() {
    var sm:(a:Int, b:Int) -> Int = ::sum
    println(sm(3,7))
    calculator(5,15, ::sum)


}


fun sum (a:Int, b:Int) : Int {
    return a+b
}

fun calculator(a:Int, b:Int, sum:(Int, Int) -> Int) {
    val result = sum(a,b)
    println(result)
}
