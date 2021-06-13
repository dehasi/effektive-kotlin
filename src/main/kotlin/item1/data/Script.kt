package item1.data

import java.util.*

fun main() {

    val names: SortedSet<FullName> = TreeSet()
    val person = FullName("AAA", "AAA")
    names.add(person)
    names.add(FullName("JOrdan", "Hansen"))
    names.add(FullName("Davwif", "Blacn"))

    println(names)
    println(person in names)

    person.name = "ZZZ"
    println(names)
    println(person in names)
}


class FullName(var name: String, var surname: String) : Comparable<FullName> {
    override fun compareTo(that: FullName): Int {
        val result = this.name.compareTo(that.name)
        return if (result == 0) this.surname.compareTo(that.surname)
        else result;
    }

    override fun toString(): String {
        return "('$name','$surname')"
    }


}
