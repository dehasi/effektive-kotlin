package item2.p01

class User

val users = listOf(User())

fun hasValue() = false
fun getValue() = User()


enum class Color {
    RED, YELLOW, BLUE
}

fun updateWeather(degrees: Int) {
    val (description, color) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "Warm" to Color.YELLOW
        else -> "hot" to Color.RED
    }
}

fun main() {

    for (i in users.indices) {
        val user = users[i]
        println("User $i at $user")
    }
    for ((i, user) in users.withIndex())
        println("$i $user")

    val user = if (hasValue()) getValue() else User()
    println(user)
}
