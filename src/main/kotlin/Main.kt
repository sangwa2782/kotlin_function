
import java.util.*

// Program for default and named argument in Kotlin


// function with Default and named Arguments
fun printCountryDetails(countryName: String="India",noOfStates: Int=30){
    println("Country : $countryName")
    println("No. of States in $countryName : $noOfStates")
}


// Main function, Entry Point of Program
fun main(args:Array<String>){
    // Call function without parameter so
    // default value passed to function
    printCountryDetails()

    // Call function with parameter value
    printCountryDetails("America",51)

    // call function with only one parameter,
    // so for second argument default value
    // of argument will be used
    printCountryDetails("Australia")

    // call function with named argument,
    // we write function argument name while
    // calling function
    printCountryDetails(countryName = "Japan",noOfStates = 15)
}















