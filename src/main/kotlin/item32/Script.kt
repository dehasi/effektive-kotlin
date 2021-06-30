package item32

import kotlin.reflect.full.declaredMemberFunctions
import kotlin.reflect.jvm.isAccessible

class Employee {
    private val id: Int = 2
    override fun toString() = "User (id=$id)"

    private fun privateFunction() {
        println("The private function has been called")
    }
}

fun callPrivateFunction(employee: Employee) {
    employee::class.declaredMemberFunctions
        .first { it.name == "privateFunction" }
        .apply { isAccessible = true }
        .call(employee)
}

fun changeEmployeeId(employee: Employee, newId: Int) {
    employee::class.java.getDeclaredField("id")
        .apply { isAccessible = true }
        .set(employee, newId)
}

fun main() {
    val employee = Employee()
    println(employee)
    callPrivateFunction(employee)

    changeEmployeeId(employee, 1)
    println(employee)
}
