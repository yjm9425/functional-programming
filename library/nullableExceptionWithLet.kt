
fun printUser(user: User?) {
    user?.let { println(it.firstName) }
}
