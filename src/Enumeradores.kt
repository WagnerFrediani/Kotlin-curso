fun main() {

    val tipoDaConta = TipoConta.CORRENTE
    val tipoDaConta2 = TipoConta.POUPANCA

    println(tipoDaConta.nomeConta )
    println(tipoDaConta2.nomeConta )

}

enum class TipoConta(var nomeConta: String){
    CORRENTE("Corrente"),
    POUPANCA("Poupança"),
    SALARIO("Salário")
}