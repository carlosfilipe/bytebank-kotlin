fun testConditions(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("conta zerada")
        else -> println("conta negativa")
    }
}
