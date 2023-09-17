
import java.util.*


// Kotlin Program to Check Whether a Number is Palindrome or Not

fun main() {

    var a = 424
    var b = 0

    val c:Int = a


    while (a != 0) {
       var digit = a % 10
        b = b *10 + digit
        a /=10
    }

    if (c == b) {
        println("$c is Palindrom")
    } else {
        println("$c is not a palindrom")
    }



}









