fun main(){

    val titular: String = "Carlos"
    val numeroConta: Int = 1000
    var saldo: Double = 0.0

//    saldo = 100.0
//
//    saldo += + 200
    saldo = -1.0

    println("Titular: $titular")
    println("Número da conta: $numeroConta")
    println("Saldo: $saldo")

    when {
        saldo > 0.0 -> println("Conta positiva")
        saldo == 0.0 -> println("conta zerada")
        else -> println("conta negativa")
    }



}

