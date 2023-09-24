
import java.util.*



// Kotlin Default Argument function
fun main () {
    var result = add(4)
    println(result)
}

fun add(a:Int, b:Int = 6) : Int = a+b