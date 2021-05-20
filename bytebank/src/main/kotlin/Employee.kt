open class Employee(
    val name: String,
    val cpf: String,
    val salary: Double,
) {
    open fun bonification(): Double = this.salary * 0.1
}