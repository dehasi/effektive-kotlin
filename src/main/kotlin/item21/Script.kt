package item21

import kotlin.properties.Delegates.observable
import kotlin.reflect.KProperty


val value by lazy { createValue() }

fun createValue(): Int {
    println("createValue")
    return 42
}

var items: List<String> by observable(listOf("a")) { a, old, new ->
    println("Notify data changed from $old to $new with $a")
}

var key: String by observable("aaa") { _, old, new ->
    println("Notify data changed from $old to $new")
}

private class LoggingProperty<T>(var value: T) {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): T {
        println("${prop.name} returned value $value")
        return value
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: T) {
        val name = prop.name
        println("$name changed from $value to $newValue")
        value = newValue
    }
}

var attempts: Int by LoggingProperty(0)
fun main() {
    println(value)
    println(value)

    println(items)
    items = listOf("b")
    println(items)
    key = "42"

    attempts++
    attempts++
}
