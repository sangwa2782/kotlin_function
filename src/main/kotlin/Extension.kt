import java.util.*
import kotlin.math.hypot


//// 1. ----------------- kotlin default argument -----------------------


//fun main() {
//    println("----- Call with argument ------")
//    default("Ajay")
//
//    println()
//    println("----- Call without argument -----")
//    default()
//}
//
//fun default(name:String="Krishav") {
//    println("$name Kumar")
//}


////kotlin named argument
//fun main() {
//    println("By using named arguments, we can pass the arguments in any order we want,\n" +
//            "which can make the code more readable.")
//    greet(lname="kumar", fname = "Ajay", )
//
//}
//
//fun greet(fname:String, lname:String) {
//    println("$fname $lname")
//}


//// 2. --------------- Kotlin infix function notation ----------------

//class math {
//    // user defined infix member function
//    infix fun square(n : Int): Int{
//        val num = n * n
//        return num
//    }
//}
//fun main(args: Array<String>) {
//    val m = math()
//    // call using infix notation
//    val result = m square 3
//    print("The square of a number is: "+result)
//}



//// 3. ---------------- Kotlin Recursion -------------------------------

//(1) Normal function
//            fun sum(a:Int, b:Int) : Int {
//                val num = a +b
//                return num
//            }
//
//            fun main() {
//                sum(5,6)
//            }



//(2) Recursive function 1
//            fun callMe(a:Int) {
//                println(a)
//                if(a>0) callMe(a-1)
//            }
//
//            fun main() {
//                val n = 5
//                callMe(n)
//            }
//(3) Recursive function 2
//
//                // Kotlin program of factorial using recursion
//                fun Fact(num: Int): Long {
//                    return if (num == 1) num.toLong() // terminate condition
//                    else num * Fact(num - 1)
//                }
//                //main method
//                fun main()
//                {
//                    println("Factorial of 5 is: " + Fact(5))
//                    // Recursive call
//                }



