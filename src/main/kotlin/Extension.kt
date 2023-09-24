
//kotlin Scope Function ( Let )



class Person {
    var name:String? = null
    var age:Int = 0
}



fun main() {
    //code using apply scope()
    //it returns the same object after applying
    val person = Person().apply {
        name="PersonName"
        age = 26
    }


    //like with, let returns last statement as lambdas
    //You should use let when you want to perform a single
    //action on an object
    //
    person.name?.let {
        println(it.reversed())
        println(it.length)
    }

}





