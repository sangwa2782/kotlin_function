
import java.util.Scanner



// Kotlin Program to Print an Integer (Entered by the User)

fun main() {


    print("Enter Your Value : ")
    val s = readln()

    val intValue:Int = s.toInt()

    println("Your value is  : ${checkInt(intValue)}")
}

fun checkInt(intValue: Int):Int {
    return intValue
}
