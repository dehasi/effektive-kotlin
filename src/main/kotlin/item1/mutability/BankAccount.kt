package item1.mutability

class BankAccount {
    var balance = 0.0
        private set

    fun deposit(depositAmount: Double) {
        balance += depositAmount
    }

    @Throws(InsufficientFunds::class)
    fun withdraw(withdrawalAmount: Double) {
        if (balance < withdrawalAmount) {
            throw InsufficientFunds()
        }
        balance -= withdrawalAmount
    }
}

class InsufficientFunds : Exception()


