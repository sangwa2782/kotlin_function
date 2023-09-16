
import java.util.*


// Kotlin Program to Find LCM of two Numbers

fun main() {

    val a = 36
    var b = 72
    var gcd = 1

    var i = 1

    while (i < a && i < b) {
        if (a % i == 0 && b % i == 0)
            gcd = i
            ++i
    }
    val lcm = a*b/gcd
    println("L.C.M of $a and $b is $lcm")
}





