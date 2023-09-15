import java.text.SimpleDateFormat
import java.util.Date
import java.util.Scanner


// Write a Kotlin program to find the maximum and minimum of three numbers.

fun main () {
    val s = Scanner(System.`in`)

    print("Enter First digit : ")
    val a = s.nextInt()

    print("Enter Second digit : ")
    val b = s.nextInt()

    print("Enter Third digit : ")
    val c = s.nextInt()


    checkMax(a,b,c)

}



fun checkMax(a:Int, b:Int, c:Int) {

   when {
       a > b && a > c -> println("$a is Maximum among $a , $b and $c")
       b > a && b > c -> println("$b is Maximum among $a , $b and $c")
       else -> println("$c is Maximum among $a , $b and $c")
    }

    when {
        a < b && a < c -> println("$a is Minimum among $a , $b and $c")
        b < a && b < c -> println("$b is Minimum among $a , $b and $c")
        else -> println("$c is Minimum among $a , $b and $c")
    }

    val maximum = maxOf(a,b,c)
    val minimum = minOf(a,b,c)

    println("Maximum number among three numbers is : $maximum")
    println("Minimum number among three numbers is : $minimum")

//    using if-else condition
//    if (a >= b && a >= c)
//        println("$a is the largest number.")
//    else if (b >= a && b >= c)
//        println("$b is the largest number.")
//    else
//        println("$c is the largest number.")


}
