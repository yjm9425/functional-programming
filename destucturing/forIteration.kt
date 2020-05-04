
data class Develoer(val name: String, val position: String)

fun main(args: Array<String>) {
    val developer1: Develoer = Develoer("Henry", "Front-end")
    val developer2: Develoer = Develoer("Ted", "CTO")
    val developer3: Develoer = Develoer("Jake", "Back-end")

    val developers = listOf(developer1, developer2, developer3)

    for ((name, position) in developers) {
        println("name:$name, position:$position")
    }
}
