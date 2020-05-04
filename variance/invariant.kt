

interface Box<T>
open class Language
open class JVM : Language()
class Kotlin : JVM()

val languageBox = object : Box<Language> {}
val jvmBox = object : Box<JVM> {}
val kotlinBox = object : Box<Kotlin> {}

fun main(args: Array<String>) {
    invariant(languageBox)
    invariant(jvmBox)
    invariant(kotlinBox)
}

fun invariant(value: Box<JVM>) {}
