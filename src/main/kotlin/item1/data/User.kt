package item1.data

class User1(
    val name: String,
    val surname: String
) {
    fun withSurname(surname: String) = User1(name, surname)
}

data class User(
    val name: String,
    val surname: String
)

fun main() {
    var user1 = User1("Maja", "Markwiewicz")
    user1 = user1.withSurname("Moskała")
    println(user1.surname)

    var user = User("Maja", "Markwiewicz")
    user = user.copy(surname = "Mosjała")
    println(user)
}
