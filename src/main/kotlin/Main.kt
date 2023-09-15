import java.text.SimpleDateFormat
import java.util.Date
import java.util.Scanner


// Write a Kotlin program to perform addition, subtraction, multiplication and division of two numbers.

fun main () {
    val s = Scanner(System.`in`)

    print("Enter First digit : ")
    val a = s.nextInt()

    print("Enter Second digit : ")
    val b = s.nextInt()

    val addResult = addition(a,b)
    println("On Adding $a and $b, we have result = $addResult")

    val subResult = subtract(a,b)
    println("On Subtracting $a and $b, we have result = $subResult")

    val mulResult = multiply(a,b)
    println("On Multiplying $a and $b, we have result = $mulResult")

    val devideResult = devide(a,b)
    println("On Deviding $a and $b, we have result = $devideResult")


}

fun addition(a:Int, b:Int):Int {
    return a + b
}

fun subtract(a: Int, b: Int):Int {
    return a - b
}

fun multiply(a: Int, b:Int):Int {
    return a * b
}

fun devide(a: Int, b: Int):Int {
    return a / b
}