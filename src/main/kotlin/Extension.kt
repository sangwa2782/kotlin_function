import java.util.*
import kotlin.math.hypot

//kotlin named argument


fun main() {
    //By using named arguments, we can pass the arguments in any order we want,
    // which can make the code more readable.
    greet(lname="kumar", fname = "Ajay", )

}

fun greet(fname:String, lname:String) {
    println(fname+" "+lname)
}


