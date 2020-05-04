
data class User(val name: String, val age: Int)

fun main(args: Array<String>) {
    val user: User = User("흄즈", 33)

    val (name, age) = user
    println("name: $name") // name 출력
    println("age: $age") // age 출력
}
   