
import java.util.*



// Kotlin Default Argument function with exchange value
fun main () {
    //exchange the default value

    var result = add(b = 2, a = 8)
    println(result)
}

fun add(a:Int, b:Int = 6) : Int = a+b