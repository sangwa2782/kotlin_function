
import java.util.*


// Kotlin Program to Reverse a Number

fun main() {

    var a = 6546465
    var b = 0

    while (a != 0) {
        val digit = a % 10
        b = b * 10 + digit
        a /= 10
    }

    print("Opposite value of $a is $b")


}









