
import java.util.*

// Program for extension function features in Kotlin

class MyClass1 {
    fun sayHelo () {
        println("Say Hello")
    }
}

class MyClass2 {
    companion object {
        fun display() {
            println("Display from companion object !!")
        }

    }
}

fun MyClass1.greetExtn() {
    println("Greeting from extension function !! ")
}

fun Int.isOdd() {
    if(this%2==0) {
        println("Number is Even")
    }
}

fun MyClass2.Companion.printData() {
    println("Extension function for Companion object !!")
}

fun main() {
    val myClass1 = MyClass1()
    myClass1.sayHelo()

    myClass1.greetExtn()
    24.isOdd()

    MyClass2.display()
    MyClass2.printData()
}
















