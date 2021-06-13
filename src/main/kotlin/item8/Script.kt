package item8

import kotlin.properties.Delegates

fun largestOf(vararg nums:Int): Int = nums.max()!!

val id:Int by Delegates.notNull()
// var propId : Int by arg("33") // loot at Item 21
fun main() {
    largestOf() // NPE
    print(id) // ISE
}
