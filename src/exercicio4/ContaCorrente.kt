package exercicio4

class ContaCorrente(
    private var deposito : Double = 0.0,
    private var saque : Double = 0.0,
    private var saldoAtual : Double = 0.0
) : Conta() {

    override fun deposito(): Double {
        println("----------------------------------------------------")
        println("Insira o valor do depósito desejado: ")
        deposito = readln().toDouble()
        println("----------------------------------------------------")

        if (deposito > 5000){
            println("Operação inválida, procure a sua agência.")
            deposito = 0.0
        }

        return deposito
    }

    override fun saque(): Double {
        println("----------------------------------------------------")
        println("Insira o valor do saque desejado: ")
        saque = readln().toDouble()
        println("----------------------------------------------------")

        return saque
    }

    override fun saldo(): Double {
        saldoAtual -= saque
        saldoAtual += deposito
        saque = 0.0
        deposito = 0.0
        return saldoAtual
    }
}