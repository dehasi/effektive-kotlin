package item1.collections

import kotlin.concurrent.thread
import kotlin.properties.Delegates

var names by Delegates.observable(listOf<String>()) { _, old, new ->
    println("Names changed from $old to $new")
}

fun main() {
    val list1: MutableList<Int> = mutableListOf()
    var list2: List<Int> = listOf()

    list1.add(1)
    list2 = list2 + 1

    list1 += 1
    list2 += 1

    println(list1)
    println(list2)

    var list = listOf<Int>()
    for (i in 1..1000) {
        thread {
            list = list + i
        }
    }
    println(list.size)

    names += "Fabio"
    names += "Bill"
}
