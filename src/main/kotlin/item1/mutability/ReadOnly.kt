package item1.mutability

var name: String = "Marcin"
var surname: String = "Moskała"
val fullname
    get() = "$name $surname"

fun calculate(): Int {
    println("Calculating...")
    return 42
}

val fizz = calculate()
val buzz
    get() = calculate()

fun main() {
    println(fullname) // Marcin Moskała
    name = "Maja"
    println(fullname) // Maja Moskała

    println(fizz)
    println(fizz)
    println(buzz)
    println(buzz)
}
