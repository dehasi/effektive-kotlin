package item1.mutability

val name1: String? = "Marton"
val surname1: String? = "Braun"

val fullname1: String?
    get() = name1?.let { "$it $surname1" }

val fullname2 = name1?.let { "$it $surname1" }

fun main() {
    if (fullname1 != null)
        println(fullname1?.length)
    if (fullname2 != null)
        println(fullname2.length)
}
