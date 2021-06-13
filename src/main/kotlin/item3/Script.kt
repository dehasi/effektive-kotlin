package item3

fun statedType() {
    val value: String = JavaClass().value // NPE
    println(value.length)
}


fun platformType() {
    val value = JavaClass().value
    println(value.length) // NPE
}

fun main() {
    statedType()
    platformType()
}
