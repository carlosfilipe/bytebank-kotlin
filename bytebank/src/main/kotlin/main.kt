fun main() {
    val alex = Employee(
        name = "Alex",
        cpf = "sdfsd",
        salary = 1000.0
    )

    println("nome ${alex.name}")
    println("cpf ${alex.cpf}")
    println("salario ${alex.salary}")
    println("Bonificação: ${alex.bonification()}")

    val gerente = Manager(
        name = "Alex",
        cpf = "sdfsd",
        salary = 1000.0,
        senha = 3
    )
    println()

    println("Gerente")
    println("nome ${gerente.name}")
    println("cpf ${gerente.cpf}")
    println("salario ${gerente.salary}")
    println("Bonificação: ${gerente.bonification()}")

    if (gerente.autentica(3)) {
        println("autenteicado com sucess")
    } else {
        print("falha")
    }


    val gui = Director(
        name = "Gui",
        cpf = "0000",
        salary = 4000.0,
        senha = 400,
        plr = 200.0
    )

    println()
    println("Diretor")
    println("nome ${gui.name}")
    println("cpf ${gui.cpf}")
    println("salario ${gui.salary}")
    println("Bonificação: ${gui.bonification()}")
    println("PLR: ${gui.plr}")

    if (gui.autentica(400)) {
        println("autenteicado com sucess")
    } else {
        print("falha")
    }


}




