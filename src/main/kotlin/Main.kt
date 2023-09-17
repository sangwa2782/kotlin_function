
import java.util.*


// Kotlin Program to Check Whether a Number is Palindrome or Not

fun main() {

    var a = 424
    var b = 0

    val original:Int = a


    while (a != 0) {
       var digit = a % 10
        b = b *10 + digit
        a /=10
    }

    if (original == b) {
        println("$original is Palindrom")
    } else {
        println("$original is not a palindrom")
    }



}









