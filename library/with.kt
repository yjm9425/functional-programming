
val person = Person("FP", 30)
val result = with(person) {
    name = "Kotlin"
    age = 10
    this
}

println(result)