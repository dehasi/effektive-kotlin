package item1.mutability

val a = 10

val list: MutableList<Int> = mutableListOf()

fun main() {
    val account = BankAccount()
    println(account.balance)
    account.deposit(100.0)
    println(account.balance)
    account.withdraw(50.0)
    println(account.balance)
}
