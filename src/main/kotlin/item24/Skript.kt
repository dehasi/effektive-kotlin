package item24

fun printProcessedNumber(transition: (Int) -> Any) {
    println(transition(42))
}

val intToDouble: (Int) -> Number = { it.toDouble() }
val numberAsText: (Number) -> Any = { it.toString() }
val identity: (Number) -> Number = { it }
val numberToInt: (Number) -> Int = { it.toInt() }
val numberHash: (Any) -> Number = { it.hashCode() }


open class Dog
class Puppy : Dog()
class Hound : Dog()

fun takeDog(dog: Dog) {}

class OutBox<out T> {
    private var value: T? = null

    private fun set(value: T) {
        this.value = value
    }

    fun get(): T = value ?: error("Value not set")
}

sealed class Response<out R, out E>
class Success<out R>(val value: R) : Response<R, Nothing>()
class Failure<out E>(val error: E) : Response<Nothing, E>()

open class Car
interface Boat
class Amphibious : Car(), Boat

fun getAmphibious(): Amphibious = Amphibious()

val car: Car = getAmphibious()
val boat: Boat = getAmphibious()

// Illegal
// class InBox<in T>(val value: T)


fun main() {
    printProcessedNumber(intToDouble)
    printProcessedNumber(numberAsText)
    printProcessedNumber(identity)
    printProcessedNumber(numberToInt)
    printProcessedNumber(numberHash)

    takeDog(Dog())
    takeDog(Puppy())
    takeDog(Hound())
}