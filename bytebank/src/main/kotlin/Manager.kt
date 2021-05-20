class Manager(
    name: String,
    cpf: String,
    salary: Double,
    val senha: Int
) : Employee(name, cpf, salary) {

    override fun bonification(): Double {
        return super.bonification() + salary
    }

    fun autentica(senha: Int): Boolean {
        if(this.senha == senha) {
            return true
        }
        return false
    }
}