
import java.util.*


// Kotlin Program to Remove All Whitespaces from a String

fun main() {

   var sentence = "T     his is be    t te   r  ."
    println("Original Number : $sentence")

    sentence = sentence.replace("\\s".toRegex(), "")
    println("After Replacement = $sentence")

  }




