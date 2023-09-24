
//kotlin Extension Function(Companion Function)


class Example {
    companion object {

    }
}

fun Example.Companion.someExample() {
    println("This is Ajay Kumar")
}

fun main() {
    Example.someExample()
}