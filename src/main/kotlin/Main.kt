import java.util.Scanner


// Write a Kotlin program to find out what version of Kotlin you are using.

fun main () {
    kotlinVersion()
}

fun kotlinVersion() {
    val kotlinVer = KotlinVersion.CURRENT
    println("Your Current Version of Kotlin is : $kotlinVer")
}