package item11

import kotlin.random.Random

class Person(var isAdult: Boolean)


operator fun String.invoke(f: () -> String): String = this + f()
infix fun String.and(s: String) = this + s

val abc = "A" { "B" } and "C"
fun main() {
    println(abc)
    val person: Person = Person(Random(1).nextBoolean())
    val let = person.takeIf { it.isAdult }
        ?.let { it.hashCode() + 42 }
        ?: run {
            println("error")
        }

    print("let is $let")
}
