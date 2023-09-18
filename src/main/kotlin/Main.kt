
import java.util.*


// Example 1: Programs to print triangles using *, numbers and characters

fun main(args: Array<String>) {
    val rows = 5

    // ------------------------------------//



//    for (i in 1..rows) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *



    //-------------------------------------//



//    for (i in 1..rows) {
//        for (j in i..rows) {
//            print("* ")
//        }
//        println()
//    }

//    * * * * *
//    * * * *
//    * * *
//    * *
//    *



    //-----------------------------------------//




//    for (i in 1..rows) {
//        for (j in 1..i) {
//            print("* ")
//        }
//        println()
//    }
//    for (i in 1..rows) {
//        for (j in i..rows-1) {
//            print("* ")
//        }
//        println()
//    }

//    *
//    * *
//    * * *
//    * * * *
//    * * * * *
//    * * * *
//    * * *
//    * *
//    *

    // --------------------------------------------//


//    for (i in 1..rows) {
//        for (j in i..rows-1) {
//            print("- ")
//        }
//        for (k in 1..i) {
//            print("* ")
//        }
//        println()
//    }

//    - - - - *
//    - - - * *
//    - - * * *
//    - * * * *
//    * * * * *


    //---------------------------------------------//


    for (i in 1..rows) {
        for (j in i..rows) {
            print("  ")
        }
        for (k in 1..i) {
            print("* ")
        }
        for (l in 1..i-1) {
            print("* ")
        }
        println()

    }
//
//            *
//          * * *
//        * * * * *
//      * * * * * * *
//    * * * * * * * * *






}














