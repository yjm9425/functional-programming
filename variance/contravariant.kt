

interface Box<T>
open class Language
open class JVM : Language()
class Kotlin : JVM()

val languageBox = object : Box<Language> {}
val jvmBox = object : Box<JVM> {}
val kotlinBox = object : Box<Kotlin> {}

fun main(args: Array<String>) {
    contravariant(languageBox)
    contravariant(jvmBox)
    contravariant(kotlinBox)
}

fun contravariant(value: Box<in JVM>) {}
