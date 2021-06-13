package item1.collections

val list = listOf(1,2,3)

fun main() {

    val mutableList = list.toMutableList()
    mutableList.add(4)
    if (list is MutableList) {
        list.add(4)
    }
}
