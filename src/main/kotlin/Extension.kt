
//kotlin Extension Function
class ExtensionRactangle(val length: Int, val width: Int) {

    fun area(): Int = length * width

}

fun ExtensionRactangle.Perimeter (): Int {
    var a = length + width
    var b = 2*a
    return b
}



fun main() {
    val ractangle = ExtensionRactangle(5,9)

    println(ractangle.Perimeter())
}
