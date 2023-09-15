import java.text.SimpleDateFormat
import java.util.Date
import java.util.Scanner


// Write a Kotlin program to display the current date and time.

fun main () {
    dateandTime()
}

fun dateandTime() {
    val dates = Date()
    val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val formattedDate = dateFormat.format(dates)
    println("Current Date and Time : $formattedDate")
}