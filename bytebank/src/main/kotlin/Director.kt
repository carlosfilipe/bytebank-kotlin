class Director(
    name: String,
    cpf: String,
    salary: Double,
    val senha: Int,
    val plr: Double
) : Employee(name, cpf, salary) {

    override fun bonification(): Double {
        return super.bonification() + salary + plr

    }

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            return true
        }
        return false
    }
}