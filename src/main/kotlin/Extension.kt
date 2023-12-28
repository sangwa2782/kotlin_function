import java.util.*
import kotlin.math.hypot

//kotlin default argument


fun main() {
    //call for named argument
    greet("Ajay")

    //cal for default argument
    greet()
}

fun greet(name:String="World") {
    println("Hello $name")
}


