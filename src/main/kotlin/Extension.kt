
//kotlin Scope Function ( With )



class Person {
    var name:String? = "PersonName"
    var age:Int = 20
}



fun main() {
    val person = Person()

    //Ordinary code
    println(person.name)
    println(person.age)

    //code using with scope()
    var returnFromWith : String = with(person) {
        println(name)
        println(age)
        "last statement will return as lambda result"
    }
    println(returnFromWith)

}





