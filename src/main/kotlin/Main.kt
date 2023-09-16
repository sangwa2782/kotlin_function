
import java.util.*


// Kotlin Program to Find Factorial of a Number

fun main() {

    val a = 10
    var b = 0
    var c = 1

    println("Febonacci series of $a is : ")

    for (i in 1..a) {
        print("$b + ")
        var sum = b + c
        b = c
        c = sum
    }

}





