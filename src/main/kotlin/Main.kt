
import java.util.*


// Kotlin Program to Find Factorial of a Number

fun main() {

    val a = 10

    factorial(a)

}

fun factorial(a: Int) {
    var b= 1

    println("Table of $a is = ")
    for (i in 1..a) {
        println("$a * $i = ${a*i}")
    }

}




