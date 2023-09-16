
import java.util.*


// Kotlin Program to Check Whether an Alphabet is Vowel or Consonant

fun main() {

   val a = 'e'

    val vowel = listOf('a','e','i','o','u')



//    if (a in vowel) {
//        println("Character is Vowel")
//    } else {
//        println("Charecter is Consonent")
//    }

    when {
        a in vowel -> println("Charecter '$a' is Vowel")
        else -> println("Charecter '$a' is Consonent")
    }


//    checkVowel(a)


  }




//fun checkVowel(a:Char) {
//    val vowel = listOf('a','e','i','o','u')
//    when {
//        a in vowel -> println("Charecter '$a' is Vowel")
//        else -> println("Charecter '$a' is Consonent")
//    }
//}




