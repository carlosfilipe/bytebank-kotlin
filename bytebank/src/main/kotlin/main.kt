fun main() {
    println("Bem vindo ao Bytebank!")
    

}

class Account {
    var titular = ""
    var numero = 0
    var saldo = 0.0
}

fun testCopyAndReference() {
    val contaAlex = Account()
    contaAlex.titular = "Alex"
    contaAlex.numero= 1000
    contaAlex.saldo = 200.0

    val contaFran = Account()
    contaFran.titular = "Fran"
    contaFran.numero= 1001
    contaFran.saldo = 300.0

//    println(contaAlex.titular)
//    println(contaAlex.numero)
//    println(contaAlex.saldo)
//
//    println(contaFran.titular)
//    println(contaFran.numero)
//    println(contaFran.saldo)


    val numX = 10
    var numY = numX
    numY++

    println("$numX $numY")

    val contaJoao = Account()
    contaJoao.titular = "Joao"

    var contaMaria = Account()
    contaMaria.titular = "Maria"

    println("${contaJoao} - ${contaMaria}")

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
