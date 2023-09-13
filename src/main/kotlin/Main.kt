
// takes an array of integers and prints only even numbers.

fun main(args: Array<String>) {
   val numbers = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14)
    printEvenNumber(numbers)
}

fun printEvenNumber(numbers: IntArray) {
  println("Even Numbers: ")
    for (number in numbers) {
        if (number % 2 == 0) {
            println(number)
        }
    }
}