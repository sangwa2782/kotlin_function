import java.text.SimpleDateFormat
import java.util.Date
import java.util.Scanner


// Write a Kotlin program to check if a given number is even or odd.

fun main () {
    val s = Scanner(System.`in`)

    print("Enter First digit : ")
    val a = s.nextInt()

    checkOddEven(a)

}

fun checkOddEven(a:Int) {
    if (a % 2 == 0) {
        println("Your number is Even.")
    } else {
        println("Your number is odd.")
    }
}
