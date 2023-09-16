
import java.util.Scanner



// Kotlin Program to Kotlin Program to Add Two Integers

fun main() {


    println("Enter first Value : ")
    val s = readln()
    val intValue:Double = s.toDouble()

    println("Enter Second Value : ")
    val y = readln()
    val intValue2 : Double = y.toDouble()



    add(intValue, intValue2)
}

fun add(intValue: Double, intValue2: Double) {
    val value = intValue + intValue2
    println("sum of $intValue and $intValue2 is $value")
}
