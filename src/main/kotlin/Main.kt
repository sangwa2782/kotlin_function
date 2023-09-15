import java.util.Scanner

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
//fun main() {
//    val str = "Kotlin Functions"
//    val countVowel = vowelsCount(str)
//    println("Number of vowel in vowel in '$str' is $countVowel")
//}
//
//fun vowelsCount(input: String) : Int {
//    val vowel = listOf('a','e','i','o','u')
//    var count = 0
//
//    for (char in input.lowercase()) {
//        if (char in vowel) {
//            count++
//        }
//    }
//    return count
//}




//Write a Kotlin function that reverses a given string.
//fun main() {
//    val str = "kotlin functions"
//    println("Original String : $str")
//
//    var reverseStr = StringReverse(str)
//    println("Reverse String is : $reverseStr")
//}
//
//fun StringReverse(input: String) : String {
//    return input.reversed()
//}




//Write a Kotlin function that checks if a string is a palindrome or not.
//fun main() {
//    val str1 = "madam"
//    val str2 = "kotlin"
//
//    println("$str1 is palindrome: ${isPalindrome(str1)}")
//    println("$str2 is palindrome: ${isPalindrome(str2)}")
//
//}
//
//fun isPalindrome(input: String): Boolean {
//    val cleanStr = input.lowercase().replace(Regex("[^a-zA-Z0-9]"),"")
//    return cleanStr == cleanStr.reversed()
//}


//Write a Kotlin function that prints a message and does not return anything.

//fun main() {
//    printMessage("Hello World")
//}
//
//fun printMessage(input: String) {
//    println(input)
//}
//Explanation:
//
//The "printMessage()" function takes a parameter message of type String. Inside the function, it prints the message using the println function.
//
//In the main function, we call the "printMessage()" function and provide the message "Hello, world!" as an argument. The function prints the message to the console.
//
//Since the "printMessage()" function does not return any value (unit-returning function), its return type is Unit, which is the default return type for functions that do not specify a return type explicitly.
//






// Write a Kotlin function that calculates and returns the area of a rectangle. It should take 'length' and 'width' as arguments, with default values of 0.0.

//fun main() {
//    val area = areaOfRactangle(7.2,3.6)
//    println("Area of Ractangle is : $area")
//}
//
//
//fun areaOfRactangle(length: Double = 0.0, width: Double = 0.0):Double {
//    return length * width
//}

//Explanation:
//
//In the above exercise -
//
//The "calculateArea()" function takes two parameters: length and width, both of type Double. These parameters have default values of 0.0, which means they can be omitted when calling the function.
//Inside the function, it calculates the rectangle area by multiplying the length and width values. The result is then returned as a Double value.
//In the "main()" function, we call the "calculateArea()" function with a length of 7.0 and width of 3.0. The returned area value is stored in the area variable, and then printed using println() function.


fun main() {
    val s = Scanner(System.`in`)

    print("Enter Your Name: ")
    val name = s.nextLine()

    val names = yourName(name)

    println("Your name is : $names")
}

fun yourName(name: String): String {
    return  name
}
