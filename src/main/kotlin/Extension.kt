
//kotlin Extension Function(Array exchange)


fun main() {
    val list = mutableListOf(12,34,45,21)
    println(list.swap(0,2))
}

fun MutableList<Int>?.swap(first:Int, second:Int):Any {
    if (this == null) {
        return "null"
    } else {
        var temp = this[first]
        this[first] = this[second]
        this[second] = temp
        return this
    }
}