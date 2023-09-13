
// takes an array of integers and prints only even numbers.
//fun main(args: Array<String>) {
//   val numbers = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)
//    printEvenNumber(numbers)
//}
//
//fun printEvenNumber(numbers: IntArray) {
//  println("Even Numbers: ")
//    for (number in numbers) {
//        if (number % 2 == 0) {
//            println(number)
//        }
//    }
//}





// Write a Kotlin function `countVowels` that counts the number of vowels in a given string.
fun main() {
    val str = "Kotlin Functions"
    val countVowel = vowelsCount(str)
    println("Number of vowel in vowel in '$str' is $countVowel")
}

fun vowelsCount(input: String) : Int {
    val vowel = listOf('a','e','i','o','u')
    var count = 0

    for (char in input.lowercase()) {
        if (char in vowel) {
            count++
        }
    }
    return count
}




