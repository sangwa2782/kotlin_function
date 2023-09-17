
import java.util.*


// Kotlin Program to Display Prime Numbers Between Two Intervals

fun main() {

    var a = 20
    var b = 50

    while (a < b) {
        var flag = false

        for (i in 2..a / 2) {
            if (a % i == 0) {
                flag = true
                break
            }
        }
        if (!flag)
            print("$a ")
            ++a


    }
}














