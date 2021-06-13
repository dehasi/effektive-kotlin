package item2.p02

fun erato(): List<Int> {
    var numbers = (2..100).toList()
    val primes = mutableListOf<Int>()
    while (numbers.isNotEmpty()) {
        val prime = numbers.first()
        primes.add(prime)
        numbers = numbers.filter { it % prime != 0 }
    }
    return primes
}

val primes = sequence {
    var numbers = generateSequence(2) { it + 1 }

    // var prime: Int <- don't do this
    while (true) {
        val prime = numbers.first()
        yield(prime)
        numbers = numbers.filter { it % prime != 0 }
    }
}

fun main() {
    println(erato())
    println(primes.take(25).toList())
}
