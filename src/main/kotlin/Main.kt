
import java.util.*


// Kotlin Program to Find GCD of two Numbers

fun main() {

    val a = 81
    var b = 72
    var gcd = 1

    var i = 1

    while (i < a && i < b) {
        if (a % i == 0 && b % i == 0)
            gcd = i
            ++i
    }
    println("G.C.D of $a and $b is $gcd")
}





