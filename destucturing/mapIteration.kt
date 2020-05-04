

fun main(args: Array<String>) {
    val map1 = mapOf<String, Int>(("kotlin" to 1))

    for ((name, order) in map1) {
        println("name: $name, order: $order")
    }
}
