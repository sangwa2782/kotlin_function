
import java.util.*


// Check Armstrong Number for 3 digit number

fun main() {

    var a = 154
    var original = a
    var result = 0

    while (original != 0) {
        var digit = original % 10
        result += Math.pow(digit.toDouble(), 3.0).toInt()
        original /= 10
    }

    if (a == result) {
        println("$a is armstrong")
    } else {
        println("$a is not a prime number.")
    }
}














