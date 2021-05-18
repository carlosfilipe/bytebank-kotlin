fun main() {
    var i = 0
    while (i < 5) {
        
        val titular: String = "Carlos $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")

        println()
        i++
    }
//    testConditions(saldo)
    testLoops()

}

fun testConditions(saldo: Double) {
    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("conta zerada")
        else -> println("conta negativa")
    }
}

fun testLoops() {
    for (i in 1..5) {
        println(i)
    }

    for (i in 5 downTo 1 step 1) {
        if (i == 4) {
            continue
        }
        val titular: String = "Carlos $i"
        val numeroConta: Int = 1000 + i
        var saldo: Double = i + 10.0

        println("Titular: $titular")
        println("Número da conta: $numeroConta")
        println("Saldo: $saldo")

        println()
    }
}
