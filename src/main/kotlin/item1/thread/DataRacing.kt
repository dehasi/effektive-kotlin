package item1.thread

import kotlin.concurrent.thread

fun main() {
    var  num = 0
    for (i in 1..1000) {
        thread {
            Thread.sleep(10)
            num += 1
        }
    }
    Thread.sleep(5000)
    print(num)
}
