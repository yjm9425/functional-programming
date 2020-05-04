
val person = Person("FP", 30)
val result = person.run {
    name = "Kotlin"
    age = 10
    this
}
println(result)