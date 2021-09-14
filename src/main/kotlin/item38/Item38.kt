package item38

typealias onOnt = (Int) -> String

class IntListener : onOnt {
    override fun invoke(p1: Int): String = (p1 * p1).toString()
}
