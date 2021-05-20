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

}
