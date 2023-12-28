import java.util.*
import kotlin.math.hypot

//kotlin default argument


fun main() {
    //call for with argument
    greet("Ajay")

    //cal for without argument
    greet()
}

fun greet(name:String="World") {
    println("Hello $name")
}


