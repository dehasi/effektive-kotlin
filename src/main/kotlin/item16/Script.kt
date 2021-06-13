package item16

class Prpr {
    var actualProp = "42"
    var prop: String
        get() {
            println("get $actualProp")
            return actualProp;
        }
        set(value) {
            println("set $value")
            actualProp = value
        }
}

fun main() {
    val prpr = Prpr()
    prpr.prop
    prpr.prop = "14"
    prpr.prop
}
