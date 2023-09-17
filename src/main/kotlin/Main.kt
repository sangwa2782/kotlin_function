
import java.util.*


// write a program Kotlin Program to Make a Simple Calculator Using switch...case

fun main() {
    val s = Scanner(System.`in`)

    print("Enter First Number : ")
    val a = s.nextDouble()

    print("Enter Second Number : ")
    val b = s.nextDouble()

    print("Enter operator for (+, -, *, /) : ")
    val operator = s.next()[0]

    var result:Double = 0.toDouble()

    when(operator) {
        '+' -> result = a + b
        '-' -> result = a - b
        '*' -> result = a * b
        '/' -> result = a / b

        else -> print("Operator is not Correct")




    }
    println("Calculation of $a $operator $b is =  $result")

}














