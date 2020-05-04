
val person = Person("FP", 30)
val result = person.let {
    it.name = "Kotlin"
    it.age = 10
    it
}
