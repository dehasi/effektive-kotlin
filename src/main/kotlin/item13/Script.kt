package item13

import kotlin.random.Random

fun keyIsCorrect(key: String) = key.length % 2 == 0

fun verify(key: String): Unit? {
    if (key.length % 2 == 0)
        return Unit
    else
        return null
}

fun main() {
    val key = Random(42).nextDouble().toString()
    if (!keyIsCorrect(key)) return
    verify(key) ?: return
}
