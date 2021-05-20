class Account(
    var titular: String,
    val numero: Int = 0 // valor default
) {

    var saldo = 0.0
        private set

    fun deposit(ammount: Double) {
        if (ammount > 0) this.saldo += ammount
    }

    fun withdraw(ammount: Double) {
        if (this.saldo >= ammount) {
            this.saldo -= ammount
        } else {
            println("Saldo insuficiente")
        }
    }

    fun transfer(ammount: Double, destinationAccount: Account): Boolean {
        if (saldo >= ammount) {
            saldo -= ammount
            destinationAccount.deposit(ammount)

            return true
        }
        println("Saldo insuficiente")
        return false
    }


}