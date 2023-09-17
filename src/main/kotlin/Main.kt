
import java.util.*


// Kotlin Program to Display Factors of a Number

fun main() {
    val a = 10
    var b = 0

    for (i in 1..a) {
        if (a%i==0) {
            ++b
        }
    }
    print("$b")

}














