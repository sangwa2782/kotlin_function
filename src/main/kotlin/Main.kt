
import java.util.*



// Kotlin Recursion function
fun main(args:Array<String>){

    //Recursion function is a function which call itself continuously.
    //This technique is called Recursion function

    rec()


}

//Table using recursion function

val b = 12
var count = 0
fun rec() {
    count++
    if (count<=10) {
        println("$b * $count = ${b*count}")
        rec()
    }
}















