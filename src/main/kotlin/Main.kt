
import java.util.*


// Kotlin Program to Find the Frequency of Character in a String

fun main() {

    val a = "I love my family"
    val b = 'i'

    val c = a.lowercase()

    var intencity = 0

    for (i in 0..c.length-1 ) {
        if (b == c[i]) {
            intencity++
        }
    }
    println(c)

    println("Frequency of $b is : $intencity ")

  }




