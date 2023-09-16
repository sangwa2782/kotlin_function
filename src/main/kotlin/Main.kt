
import java.util.*


// Kotlin Program to Check Whether a Number is Positive or Negative

fun main() {

    val a = 0

//    if (a > 0) {
//        println("Given number is Positive")
//    } else {
//        println("Given number is Negative")
//    }

    when {
        a > 0 -> println("Given number is Positive")
        a < 0 -> println("Given number is Negative")
        else -> println("Given number is Zero")
    }

}




