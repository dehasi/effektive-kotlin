package item5

fun factorial(n: Int) {
    require(n >= 0) {
        "Expected n >= 0, but was $n"
    }

    requireNotNull(n) { "some message" }
    check(n > 0) { "some message" }
    checkNotNull(n) { "some message" }
    assert(1 == 1) { "some message" }
    SomeClass().value ?: run {
        val s = "value is null"
        return
    }

}

internal class SomeClass {
    val value: String?
        get() = null
}
