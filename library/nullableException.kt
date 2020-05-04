
data class User(val firstName: String, val lastName: String) 

fun printUserName(user: User?) {
    if(user != null) {
        println(user.firstName)
    }
}