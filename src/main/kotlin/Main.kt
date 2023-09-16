
import java.util.*


// Kotlin Program to Check Whether a Character is Alphabet or Not

fun main() {

    val c = '*'

    when {
        c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' -> println("$c is an Alphabet")
        else -> println("$c is not an Alphabet")
    }

}




