package item35

fun Int.myPlus(other: Int) = this + other
val myPlus = fun Int.(other: Int) = this + other
val myPlus2: Int.(Int) -> Int = fun Int.(other: Int) = this + other

inline fun <TYPE> TYPE.apply(function: TYPE.() -> Unit): TYPE {
    this.function()
    return this
}

class User {
    var name = ""
    var surname = ""
}


fun table(init: TableBuilder.() -> Unit): TableBuilder {
    val tableBuilder = TableBuilder()
    init.invoke(tableBuilder)
    return tableBuilder
}

class TableBuilder {
    var trs = listOf<TrBuilder>()

    fun tr(init: TrBuilder.() -> Unit) {
        trs = trs + TrBuilder().apply(init)
    }
}

class TrBuilder {
    var tds = listOf<TdBuilder>()
    fun td(init: TdBuilder.() -> Unit) {
        tds = tds + TdBuilder().apply(init)
    }
}

class TdBuilder {
    var text = ""

    operator fun String.unaryPlus() {
        text += this
    }
}


fun main() {
    println(myPlus.invoke(1, 2))
    println(myPlus(2, 4))
    println(myPlus2(2, 4))
    println(4.myPlus(3))

    val user = User().apply {
        name = "34"; surname = "515"
    }
    println(user.surname)

    table {
        tr {
            td {
                +"lol"
                +"lo2"
            }
            td {
                +"lol"
                +"lo2"
            }
        }
        tr {
            td {
                +"lol"
                +"lo2"
            }
            td {
                +"lol"
                +"lo2"
            }
        }
    }
}