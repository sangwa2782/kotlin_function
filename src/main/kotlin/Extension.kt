
//kotlin Scope Function ( apply )



class Person {
    var name:String? = ""
    var age:Int = 0
}



fun main() {

    //Ordinary code
    val person = Person()
    person.name = "personName"
    person.age = 26

    //code using apply scope()
    //it returns the same object after applying
    val person = Person().apply {
        name = "PersonName"
        age = 26
    }

}





