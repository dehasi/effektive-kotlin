package item7

sealed class Result<out T>
class Success<out T>(val result: T) : Result<T>()
class Failure(val throwable: Throwable) : Result<Nothing>()

inline fun <reified T> String.readObject(o: T): Result<T> {
    val i = o.hashCode()

    return if (i % 2 == 0) Success(o)
    else Failure(RuntimeException())
}

fun main() {
    val res = when (val optional = "".readObject(2)) {
        is Success -> optional.result
        is Failure -> -1
    }
    println(res)
    listOf(1).getOrNull(2) ?: run {
        print("no result")
    }
}
