fun testaComportamentosConta() {
    println("Bem vindo ao Bytebank!")
    val contaAlex = Account("Alex", 1001)
    contaAlex.deposit(-200.0)

    println("${contaAlex.saldo}")


    val contaJoana = Account(numero = 1002, titular = "Joana") // também pode ser assim, trocando a ordem das chamadas
    contaJoana.deposit(100.0)

    println("saldo da conta da Joana: ${contaJoana.saldo}")

    if (contaAlex.transfer(250.0, contaJoana)) {
        println("transferencia feita com sucesso")
    } else {
        println("falha na transferencia")
    }

    println("saldo da conta da Alex: ${contaAlex.saldo}")
    println("saldo da conta da Joana: ${contaJoana.saldo}")
}
