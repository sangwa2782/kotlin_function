
import java.util.*


// Kotlin Program to Find Factorial of a Number

fun main() {

    val a = 20

    println("Factorial of $a is ${factorial(a)}")

}

fun factorial(a: Int) : Long {
    var b: Long = 1
    for (i in 1..a) {
        b *= i.toLong()
    }
    return b
}




