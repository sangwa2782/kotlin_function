
import java.util.Scanner



// Kotlin Program to Compute Quotient and Remainder

fun main() {

    val s = Scanner(System.`in`)

    print("Enter dividend number : ")
    val dividend = s.nextInt()

    print("Enter divisor number : ")
    val divisor = s.nextInt()

    println("Your Quotient of $dividend and $divisor is : ${getQuotient(dividend,divisor)}")
    println("Your Remainder of $dividend and $divisor is : ${getRemainder(dividend,divisor)}")
}

fun getQuotient(dividend:Int, divisor:Int) : Int {
    return dividend / divisor
}

fun getRemainder(dividend:Int, divisor:Int) : Int {
    return dividend % divisor
}


