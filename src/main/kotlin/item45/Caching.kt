package item45

import java.math.BigInteger
import java.math.BigInteger.ONE

private val FIB_CACHE = mutableMapOf<Int, BigInteger>()

fun fib(n: Int): BigInteger = FIB_CACHE.getOrPut(n) {
    if (n <= 1) ONE else fib(n - 1) + fib(n - 2)
}

fun main() {
    println(fib(14))
}
