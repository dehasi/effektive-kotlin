package item15

class Node(val name: String) {

    fun makeChild(childName: String) =
        create("${name}.${childName}")
            .also { println("Created ${it?.name}") }

    fun create(name: String): Node? = Node(name)
}

@DslMarker
annotation class HtmlDsl

class TableDsl

fun table(f: TableDsl.() -> Unit) {}

fun main() {
    val node = Node("Parent")
    node.makeChild("child")

    table {
        tr {

        }
    }
}

fun tr(function: () -> Unit) {
    TODO("Not yet implemented")
}
