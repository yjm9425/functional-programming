
val person = Person("FP", 30)
val result = person.also {
    it.name = "Kotlin"
    it.age = 10
}

print(result)