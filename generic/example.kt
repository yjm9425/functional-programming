
class Box<T>(t: T) {
    var value = t
}

fun main(args: Array<String>) {
    val box = Box("kotlin")
    println(box)
}
