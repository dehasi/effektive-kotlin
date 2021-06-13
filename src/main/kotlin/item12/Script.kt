package item12

fun Int.factorial() = (1..this).product()

private fun Iterable<Int>.product(): Int =
    fold(1) { acc, i -> acc * i }

fun main() {
    println(5.factorial())
    repeat(3) {
        print("Hello")
    }
}
